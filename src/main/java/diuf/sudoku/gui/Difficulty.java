package diuf.sudoku.gui;

import diuf.sudoku.Settings;
import diuf.sudoku.tools.HtmlLoader;

public enum Difficulty {
    Easy {

        @Override
        public double getMinDifficulty() {
            return 1.0;
        }

        @Override
        public double getMaxDifficulty() {
            return 1.2;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        @Override
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    Medium {

        @Override
        public double getMinDifficulty() {
            return 1.3;
        }

        @Override
        public double getMaxDifficulty() {
            return 1.6;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        @Override
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    Hard {

        @Override
        public double getMinDifficulty() {
            return 1.7;
        }

        @Override
        public double getMaxDifficulty() {
            return 2.5;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        @Override
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    Superior {

        @Override
        public double getMinDifficulty() {
            if (Settings.getInstance().revisedRating() == 1)
                return 3.1;
            return 3.2;
        }

        @Override
        public double getMaxDifficulty() {
            if (Settings.getInstance().revisedRating() == 1)
                return 3.8;
            return 4.0;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            if (Settings.getInstance().revisedRating() == 1)
                return 0.0;
            return 3.8;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            if (Settings.getInstance().revisedRating() == 1)
                return 0.0;
            return 3.4;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        @Override
        public String getexcludeTechnique1() {
            return "Skyscraper";
        }
        @Override
        public String getexcludeTechnique2() {
            return "2-String Kite";
        }
        @Override
        public String getexcludeTechnique3() {
            return "Turbot Fish";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "Triple";
        }
        @Override
        public String getOneOfThree_2() {
            return "X-Wing";
        }
        @Override
        public String getOneOfThree_3() {
            return "X-Wing";
        }
    },
    Fiendish {

        @Override
        public double getMinDifficulty() {
            return 2.6;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.0;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    Fiendish2 {

        @Override
        public double getMinDifficulty() {
            return 3.0;
        }

        @Override
        public double getMaxDifficulty() {
            return 7.0;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "Forcing";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    SuperiorPlus {

        @Override
        public double getMinDifficulty() {
            if (Settings.getInstance().revisedRating() == 1)
                return 4.0;
            return 3.8;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.1;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            if (Settings.getInstance().revisedRating() == 1)
                return 0.0;
            return 4.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "XY";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    XYorXYZ {

        @Override
        public double getMinDifficulty() {
            return 4.2;
        }

        @Override
        public double getMaxDifficulty() {
            return 4.4;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "XY";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    TwoStringKite {

        @Override
        public double getMinDifficulty() {
            return 4.1;
        }

        @Override
        public double getMaxDifficulty() {
            return 4.1;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "Skyscraper";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    EmptyRectangle {

        @Override
        public double getMinDifficulty() {
            return 4.3;
        }

        @Override
        public double getMaxDifficulty() {
            return 4.3;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "Skyscraper";
        }
        @Override
        public String getexcludeTechnique2() {
            return "Kite";
        }
        @Override
        public String getexcludeTechnique3() {
            return "XY";
        }
        public String getincludeTechnique1() {
            return "Empty Rectangle";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    Grouped2StrongLinks {

        @Override
        public double getMinDifficulty() {
            return 4.3;
        }

        @Override
        public double getMaxDifficulty() {
            return 4.3;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "XY";
        }
        public String getincludeTechnique1() {
            return "11";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    XLoop {

        @Override
        public double getMinDifficulty() {
            return 4.0;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.6;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "X-Loop";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    gXLoop {

        @Override
        public double getMinDifficulty() {
            return 4.0;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.6;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "(2 Strong Links) Grouped X-Loop 2";
        }
        @Override
        public String getOneOfThree_2() {
            return "(3 Strong Links) Grouped X-Loop 3";
        }
        @Override
        public String getOneOfThree_3() {
            return "(4 Strong Links) Grouped X-Loop 4";
        }
    },
    ThreeStrongLinks {

        @Override
        public double getMinDifficulty() {
            return 5.4;
        }

        @Override
        public double getMaxDifficulty() {
            return 5.7;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return " 10";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    ThreeLinkER {

        @Override
        public double getMinDifficulty() {
            return 5.7;
        }

        @Override
        public double getMaxDifficulty() {
            return 5.7;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "2-";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "Wing 2";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "type 2";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return " 30";
        }
        @Override
        public String getOneOfThree_2() {
            return " 31";
        }
        @Override
        public String getOneOfThree_3() {
            return " 2";
        }
    },
    /*ThreeLinkEmL {

        @Override
        public double getMinDifficulty() {
            return 5.7;
        }

        @Override
        public double getMaxDifficulty() {
            return 5.7;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "EmL";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    */
    FourLinks {

        @Override
        public double getMinDifficulty() {
            return 5.8;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.1;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "4-";
        }
        @Override
        public String getOneOfThree_2() {
            return "4 S";
        }
        @Override
        public String getOneOfThree_3() {
            return "4 S";
        }
    },
    WXYZ {

        @Override
        public double getMinDifficulty() {
            return 5.5;
        }

        @Override
        public double getMaxDifficulty() {
            return 5.6;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "Wing 2";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    Uniqueness {

        @Override
        public double getMinDifficulty() {
            return 4.5;
        }

        @Override
        public double getMaxDifficulty() {
            return 5.3;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "Unique";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    UL10 {
        @Override
        public double getMinDifficulty() {
            if (Settings.getInstance().revisedRating() == 1)
                return 4.8;
            return 5.0;
        }

        @Override
        public double getMaxDifficulty() {
            if (Settings.getInstance().revisedRating() == 1)
                return 5.1;
            return 5.3;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        @Override
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "Unique Loop 10";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            if (Settings.getInstance().revisedRating() == 1)
                return "Naked";
            return "Jellyfish";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    UniquenessType3 {
        @Override
        public double getMinDifficulty() {
            if (Settings.getInstance().revisedRating() == 1)
                return 4.6;
            return 4.5;
        }

        @Override
        public double getMaxDifficulty() {
            if (Settings.getInstance().revisedRating() == 1)
                return 5.3;
            return 5.3;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        @Override
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "Unique";
        }
        @Override
        public String getincludeTechnique2() {
            return "type 3";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            if (Settings.getInstance().revisedRating() == 1)
                return "Naked";
            return "Jellyfish";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    UL12Type3 {
        @Override
        public double getMinDifficulty() {
            if (Settings.getInstance().revisedRating() == 1)
                return 4.9;
            return 5.0;
        }

        @Override
        public double getMaxDifficulty() {
            if (Settings.getInstance().revisedRating() == 1)
                return 5.2;
            return 5.3;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        @Override
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "Unique Loop 12 type 3";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            if (Settings.getInstance().revisedRating() == 1)
                return "Naked";
            return "Jellyfish";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    Quintuplet {

        @Override
        public double getMinDifficulty() {
            return 5.6;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.8;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "Quintuplet";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    APE {

        @Override
        public double getMinDifficulty() {
            return 6.2;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.2;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "ligned";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    BUGs {

        @Override
        public double getMinDifficulty() {
            return 5.6;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.1;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "BUG";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    VWXYZ {

        @Override
        public double getMinDifficulty() {
            return 6.2;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.4;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "VWXYZ-Wing 2";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    UVWXYZ {

        @Override
        public double getMinDifficulty() {
            return 6.6;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.6;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "UVWXYZ-Wing 2";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    TUVWXYZ {

        @Override
        public double getMinDifficulty() {
            return 7.5;
        }

        @Override
        public double getMaxDifficulty() {
            return 7.5;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "Chain";
        }
        @Override
        public String getexcludeTechnique2() {
            return "Aligned";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "TUVWXYZ-Wing 2";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    FiveLinks {

        @Override
        public double getMinDifficulty() {
            return 6.2;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.5;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "5-";
        }
        @Override
        public String getOneOfThree_2() {
            return "5 S";
        }
        @Override
        public String getOneOfThree_3() {
            return "5 S";
        }
    },
    SixLinks {

        @Override
        public double getMinDifficulty() {
            return 6.6;
        }

        @Override
        public double getMaxDifficulty() {
            return 6.9;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "6-";
        }
        @Override
        public String getOneOfThree_2() {
            return "6 S";
        }
        @Override
        public String getOneOfThree_3() {
            return "6 S";
        }
    },
    AdvancedPlayer {

        @Override
        public double getMinDifficulty() {
            return 7.0;
        }

        @Override
        public double getMaxDifficulty() {
            return 8.0;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    DailySudoku {

        @Override
        public double getMinDifficulty() {
            return 7.1;
        }

        @Override
        public double getMaxDifficulty() {
            return 7.2;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "Kite";
        }
        @Override
        public String getexcludeTechnique2() {
            return "XY";
        }
        @Override
        public String getexcludeTechnique3() {
            return "Strong";
        }
        public String getincludeTechnique1() {
            return "Forcing Chain";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    },
    Diabolical {

        @Override
        public double getMinDifficulty() {
            return 6.1;
        }

        @Override
        public double getMaxDifficulty() {
            return 11.0;
        }
        @Override
        public double getincludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getincludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty1() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty2() {
            return 0.0;
        }
        @Override
        public double getexcludeDifficulty3() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty1() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty2() {
            return 0.0;
        }
        @Override
        public double getnotMaxDifficulty3() {
            return 0.0;
        }
        public String getexcludeTechnique1() {
            return "";
        }
        @Override
        public String getexcludeTechnique2() {
            return "";
        }
        @Override
        public String getexcludeTechnique3() {
            return "";
        }
        public String getincludeTechnique1() {
            return "";
        }
        @Override
        public String getincludeTechnique2() {
            return "";
        }
        @Override
        public String getincludeTechnique3() {
            return "";
        }
        public String getnotMaxTechnique1() {
            return "";
        }
        @Override
        public String getnotMaxTechnique2() {
            return "";
        }
        @Override
        public String getnotMaxTechnique3() {
            return "";
        }
        @Override
        public String getOneOfThree_1() {
            return "";
        }
        @Override
        public String getOneOfThree_2() {
            return "";
        }
        @Override
        public String getOneOfThree_3() {
            return "";
        }
    };

    public abstract double getMinDifficulty();
    public abstract double getMaxDifficulty();
    public abstract double getincludeDifficulty1();
    public abstract double getincludeDifficulty2();
    public abstract double getincludeDifficulty3();
    public abstract double getexcludeDifficulty1();
    public abstract double getexcludeDifficulty2();
    public abstract double getexcludeDifficulty3();
    public abstract double getnotMaxDifficulty1();
    public abstract double getnotMaxDifficulty2();
    public abstract double getnotMaxDifficulty3();
    public abstract String getexcludeTechnique1();
    public abstract String getexcludeTechnique2();
    public abstract String getexcludeTechnique3();
    public abstract String getincludeTechnique1();
    public abstract String getincludeTechnique2();
    public abstract String getincludeTechnique3();
    public abstract String getnotMaxTechnique1();
    public abstract String getnotMaxTechnique2();
    public abstract String getnotMaxTechnique3();
    public abstract String getOneOfThree_1();
    public abstract String getOneOfThree_2();
    public abstract String getOneOfThree_3();
    public String getHtmlDescription() {
        return HtmlLoader.loadHtml(this, this.name() + ".html");
    }

}