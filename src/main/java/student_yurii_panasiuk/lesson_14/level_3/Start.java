package student_yurii_panasiuk.lesson_14.level_3;

public class Start {
    public static void main(String args[]) {

        boolean[][] grid = new boolean[50][50];
        GameOfLifeRandomStateGenerator randomStateGenerator =
                new GameOfLifeRandomStateGenerator(grid);

        switch(new ConsoleInterface().menu()) {
            case "1":
                GameOfLifeDisplayer displayerRandom = new GameOfLifeDisplayer(randomStateGenerator.fillRandomly());
                displayerRandom.startAnimation();
                break;
            case "2":
                GameOfLifeDisplayer displayer = new GameOfLifeDisplayer(new GliderGun().create());
                displayer.startAnimation();
                break;
            default:
               break;
        }
    }
}
