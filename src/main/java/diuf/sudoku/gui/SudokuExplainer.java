/*
 * Project: Sudoku Explainer
 * Copyright (C) 2006-2007 Nicolas Juillerat
 * Available under the terms of the Lesser General Public License (LGPL)
 */
package diuf.sudoku.gui;

import java.io.*;
import java.util.*;

import diuf.sudoku.*;
import diuf.sudoku.Grid.*;
import diuf.sudoku.io.*;
import diuf.sudoku.solver.*;
import diuf.sudoku.tools.*;
import lombok.extern.slf4j.Slf4j;

/**
 * The main class and controller. All actions performed in the gui
 * are directly redirected to method of this class, which
 * then calls the appropriate methods of the solver and other
 * tools.
 * <p>
 * This class only handles the logic of the filter for the hints tree,
 * and a few trivial tasks. All other operations are redirected to other
 * classes.
 * @see diuf.sudoku.solver.Solver
 */
@Slf4j
public class SudokuExplainer {

    private Grid grid; // The Sudoku grid
    private Solver solver; // The Sudoku solver

    private List<Hint> unfilteredHints = null; // All hints (unfiltered)
    private List<Hint> filteredHints = null; // All hints (filtered)
    private boolean isFiltered = true;
    private List<Hint> selectedHints = new ArrayList<Hint>(); // Currently selected hint
	private Stack<Grid> gridStack = new Stack<Grid>(); // Stack for undo
	
	
    // Cache for filter
    Set<Cell> givenCells = new HashSet<Cell>(); // Cell values already encountered
    Map<Cell, BitSet> removedPotentials = new HashMap<Cell, BitSet>(); // Removable potentials already encountered


    public SudokuExplainer() {
		grid = new Grid();
		gridStack = new Stack<Grid>();	// fix #101 - reset Undo stack (in constructor)
		solver = new Solver(grid);
        solver.rebuildPotentialValues();
    }

    private void resetFilterCache() {
        givenCells = new HashSet<Cell>(); // Cell values already encountered
        removedPotentials = new HashMap<Cell, BitSet>(); // Removable potentials already encountered
    }

    /**
     * Hint filter
     */
    private boolean isWorth(Hint hint) {
        if (!isFiltered)
            return true;
        boolean isWorth; // Check if the hint yields to new outcomes
        if (hint instanceof DirectHint)
            isWorth = isWorth(givenCells, (DirectHint)hint);
        else
            isWorth = isWorth(removedPotentials, givenCells, (IndirectHint)hint);
        return isWorth;
    }

    /**
     * Test if a {@link DirectHint} allows the placement of a new cell
     * value. Returns <tt>false</tt> if the cell value given by this
     * hint has already been given by previous hints.
     * <p>
     * used for the hints tree filter
     * @param givenCells The set of cells whose value have already been given
     * @param hint the hint to test
     * @return whether the hint allows a new cell value placement
     */
    private boolean isWorth(Set<Cell> givenCells, DirectHint hint) {
        return (!givenCells.contains(hint.getCell()));
    }

    /**
     * Test if a {@link IndirectHint} allows the removal of new potentials.
     * Returns <tt>false</tt> if all the potentials remobavle with this hint
     * have already been removed by previous hints.
     * <p>
     * Used for the hints tree filter
     * @param removedPotentials the previously removed potentials
     * @param hint the hint to test
     * @return whether the hint allows the removal of new potentials
     */
    private boolean isWorth(Map<Cell,BitSet> removedPotentials, Set<Cell> givenCells,
            IndirectHint hint) {
        if (hint instanceof WarningHint)
            return true;
        Map<Cell, BitSet> removablePotentials = hint.getRemovablePotentials();
        //for (Cell cell : removablePotentials.keySet()) {
        for (Map.Entry<Cell, BitSet> entry : removablePotentials.entrySet()) {
        	Cell cell = entry.getKey();
            //BitSet removable = removablePotentials.get(cell);
            BitSet removable = entry.getValue();
            BitSet previous = removedPotentials.get(cell);
            if (previous == null)
                return true;
            BitSet newRemove = (BitSet)removable.clone();
            newRemove.andNot(previous);
            if (!newRemove.isEmpty())
                return true;
        }
        Cell cell = hint.getCell();
        if (cell != null && !givenCells.contains(cell))
            return true;
        return false;
    }

    /**
     * Copy all the hints from {@link #unfilteredHints} to
     * {@link #filteredHints}, applying the filter if active.
     */
    private void filterHints() {
        filteredHints = null;
        if (unfilteredHints != null) {
            filteredHints = new ArrayList<Hint>();
            if (isFiltered) {
                // Filter hints with similar outcome
                for (Hint hint : unfilteredHints) {
                    if (isWorth(hint))
                        addFilteredHintAndUpdateFilter(hint);
                }
            } else {
                // Copy "as is"
                for (Hint hint : unfilteredHints)
                    filteredHints.add(hint);
            }
        }
    }

    private void addFilteredHintAndUpdateFilter(Hint hint) {
        filteredHints.add(hint);
        if (hint instanceof DirectHint) {
            // Update given cells
            DirectHint dHint = (DirectHint)hint;
            givenCells.add(dHint.getCell());
        } else {
            // Update removable potentials (candidates)
            IndirectHint iHint = (IndirectHint)hint;
            Map<Cell, BitSet> removablePotentials = iHint.getRemovablePotentials();
            //for (Cell cell : removablePotentials.keySet()) {
                //BitSet removable = removablePotentials.get(cell);
            for (Map.Entry<Cell, BitSet> entry : removablePotentials.entrySet()) {
            	Cell cell = entry.getKey();
                BitSet removable = entry.getValue();
                BitSet current = removedPotentials.get(cell);
                if (current == null) {
                    current = new BitSet(10);
                    removedPotentials.put(cell, current);
                }
                current.or(removable);
            }
            // Update given cells if any
            Cell cell = iHint.getCell();
            if (cell != null)
                givenCells.add(cell);
        }
    }

    /**
     * Check the validity of the current Sudoku grid.
     * Corresponding warning are automatically added and
     * displayed.
     * @return whether the grid is valid
     */
    public boolean checkValidity() {
        selectedHints.clear();
        unfilteredHints = new ArrayList<Hint>();
        Hint hint = solver.checkValidity();
        if (hint != null) {
            unfilteredHints.add(hint);
            selectedHints.add(hint);
        }
        filterHints();
        return (hint == null);
    }

    public void resetPotentials() {
        solver.rebuildPotentialValues();
    }

    private Hint getNextHintImpl() {
        if (unfilteredHints == null) {
            unfilteredHints = new ArrayList<Hint>();
            filterHints();
        }
        // Create temporary buffers for gathering all the hints again
        final List<Hint> buffer = new ArrayList<Hint>();
        final StrongReference<Hint> newHint = new StrongReference<Hint>();
        /*
         * Trick: gatherHints will get all the hints it can find, one after
         * the other, sorted by difficulty. It will call add() for every hint.
         * To get only the first hint, we throw an InterruptedException after the
         * first produced hint that was not filtered.
         */
        solver.gatherHints(unfilteredHints, buffer, hint -> {
            if (!buffer.contains(hint)) {
                buffer.add(hint);
                boolean isNew = (buffer.size() > unfilteredHints.size());
                if (isNew) {
                    unfilteredHints.add(hint); // This hint is new for the unfiltered list
                    if (isWorth(hint)) {
                        newHint.setValue(hint);
                        throw new InterruptedException();
                    }
                }
            }
        });
        selectedHints.clear();
        Hint hint = null;
        if (newHint.isValueSet())
            hint = newHint.getValue();
        return hint;
    }

    public void getNextHint() {
        try {
            Hint hint = getNextHintImpl();
            if (hint != null) {
                addFilteredHintAndUpdateFilter(hint);
                selectedHints.add(hint);
            }
        } catch (Throwable ex) {
            log.error("Error while getting next hint", ex);
        }
    }

    public void getAllHints() {
        try {
            unfilteredHints = solver.getAllHints();
            selectedHints.clear();
            resetFilterCache();
            filterHints();
            if (!filteredHints.isEmpty())
                selectedHints.add(filteredHints.get(0));
        } catch (Throwable ex) {
            log.error("Error while getting hints", ex);
        }
    }

    public void applySelectedHints() {
	 if ( !grid.isSolved() ) {
	  if ( selectedHints.size() >= 1 ) {
		pushGrid();
        for (Hint hint : selectedHints)
        	hint.apply(grid);
        clearHints();
	  }
	 }
    }

    public void clearHints() {
        unfilteredHints = null;
        resetFilterCache();
        filterHints();
        selectedHints.clear();
    }

    public void undoStep() {
    	popGrid();
    }

    public void applySelectedHintsAndContinue() {
	  if ( !grid.isSolved() ) {
        applySelectedHints();
        getNextHint();
	  }
    }


    public void pushGrid() {
        Grid copy = new Grid();
        this.grid.copyTo(copy);
        this.gridStack.push(copy);
      }

      private void popGrid() {
        if (!this.gridStack.isEmpty()) {
          Grid prev = this.gridStack.pop();
          prev.copyTo(this.grid);
		  //This next line will mess UNDO with Sukaku
          //this.solver.rebuildPotentialValues();
          clearHints();
        }
      }

    /**
     * Solve the current grid using brute-force.
     * Display a new hint showing the solution.
     */
    public void solve() {
        clearHints();
        unfilteredHints = new ArrayList<Hint>();
        Hint hint = solver.bruteForceSolve();
        if (hint != null) {
            unfilteredHints.add(hint);
            selectedHints.add(hint);
        }
        filterHints();
    }

    public Hint analyse() {
        try {
            clearHints();
            unfilteredHints = new ArrayList<Hint>();
            Hint hint = solver.analyse();
            if (hint != null) {
                unfilteredHints.add(hint);
                selectedHints.add(hint);
            }
            filterHints();
            return hint;
        } catch (UnsupportedOperationException ex) {
            throw ex;
        } catch (Throwable ex) {
            log.error( "Error while analysing the grid", ex);
            return null;
        }
    }

    /**
     * Display a single hint.
     * @param hint the hint to display
     */
    public void showHint(Hint hint) {
        clearHints();
        unfilteredHints = new ArrayList<Hint>();
        if (hint != null) {
            unfilteredHints.add(hint);
            selectedHints.add(hint);
        }
        filterHints();
    }

    /**
     * Get a small or big clue.
     * @param isBig whether to get a big clue
     */
    public void getClue(boolean isBig) {
        clearHints();
        Hint hint = getNextHintImpl();
        if (hint != null) {
            if (hint instanceof Rule) {
                Rule rule = (Rule)hint;
                String clueFile = (isBig ? "BigClue.html" : "SmallClue.html");
                String htmlText = HtmlLoader.loadHtml(this, clueFile);
                String clueHtml = rule.getClueHtml(grid, isBig);
                htmlText = htmlText.replace("{0}", clueHtml);
                htmlText = HtmlLoader.formatColors(htmlText);
                unfilteredHints = null;
                resetFilterCache();
                filterHints();
            } else {
                addFilteredHintAndUpdateFilter(hint);
                selectedHints.add(hint);
            }
        }
    }

}
