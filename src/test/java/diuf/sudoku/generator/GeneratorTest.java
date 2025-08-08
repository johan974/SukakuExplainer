package diuf.sudoku.generator;


import diuf.sudoku.Grid;
import diuf.sudoku.gui.Difficulty;
import diuf.sudoku.solver.Hint;
import diuf.sudoku.solver.Solver;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static diuf.sudoku.gui.Difficulty.Hard;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class GeneratorTest {
    @Test
    void testGenerateAndGet1Hint() {
        Generator generator = new Generator();
        Difficulty hard = Hard;
        Grid grid = generator.generate(List.of(Symmetry.BiDiagonal, Symmetry.Orthogonal, Symmetry.Rotational90,
                        Symmetry.Rotational180, Symmetry.Full),
                hard.getMinDifficulty(), hard.getMaxDifficulty(), hard.getincludeDifficulty1(), hard.getincludeDifficulty2(),
                hard.getincludeDifficulty3(), hard.getexcludeDifficulty1(), hard.getexcludeDifficulty2(),
                hard.getexcludeDifficulty3(), hard.getnotMaxDifficulty1(), hard.getnotMaxDifficulty2(),
                hard.getnotMaxDifficulty3(), hard.getexcludeTechnique1(), hard.getexcludeTechnique2(),
                hard.getexcludeTechnique3(), hard.getincludeTechnique1(), hard.getincludeTechnique2(),
                hard.getincludeTechnique3(), hard.getnotMaxTechnique1(), hard.getnotMaxTechnique2(),
                hard.getnotMaxTechnique3(), hard.getOneOfThree_1(), hard.getOneOfThree_2(),
                hard.getOneOfThree_3());
        assertNotNull(grid, "Generated grid should not be null");
        log.info("Generated grid:\n{}", grid);
        Solver solver = new Solver(grid);
        List<Hint> unfilteredHints = new ArrayList<>();
        List<Hint> hints = new ArrayList<>();
        solver.gatherHints(unfilteredHints, hints, hint -> {
            if (!hints.contains(hint)) {
                hints.add(hint);
                throw new InterruptedException(); // Stop gathering hints after the first one
            }
        });
        assertFalse(hints.isEmpty(), "Hints should not be empty");
        log.info("First hint: {}", hints.get(0));
        assertEquals( 81, hints.get(0).getCell().getIndex());
    }

    @Test
    void testGenerateAndGetAllHints() {
        Generator generator = new Generator();
        Difficulty hard = Hard;
        Grid grid = generator.generate(List.of(Symmetry.BiDiagonal, Symmetry.Orthogonal, Symmetry.Rotational90,
                        Symmetry.Rotational180, Symmetry.Full),
                hard.getMinDifficulty(), hard.getMaxDifficulty(), hard.getincludeDifficulty1(), hard.getincludeDifficulty2(),
                hard.getincludeDifficulty3(), hard.getexcludeDifficulty1(), hard.getexcludeDifficulty2(),
                hard.getexcludeDifficulty3(), hard.getnotMaxDifficulty1(), hard.getnotMaxDifficulty2(),
                hard.getnotMaxDifficulty3(), hard.getexcludeTechnique1(), hard.getexcludeTechnique2(),
                hard.getexcludeTechnique3(), hard.getincludeTechnique1(), hard.getincludeTechnique2(),
                hard.getincludeTechnique3(), hard.getnotMaxTechnique1(), hard.getnotMaxTechnique2(),
                hard.getnotMaxTechnique3(), hard.getOneOfThree_1(), hard.getOneOfThree_2(),
                hard.getOneOfThree_3());
        assertNotNull(grid, "Generated grid should not be null");
        log.info("Generated grid:\n{}", grid);
        Solver solver = new Solver(grid);
        List<Hint> unfilteredHints = new ArrayList<>();
        List<Hint> hints = new ArrayList<>();
        solver.gatherHints(unfilteredHints, hints, hint -> {
            if (!hints.contains(hint)) {
                hints.add(hint);
            }
        });
        assertFalse(hints.isEmpty(), "Hints should not be empty");
    }

}