package student_yurii_panasiuk.lesson_10.level_7;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_10_single_responsibility_principle/codereview/CleanCodeWarning_5.txt")
abstract class Players {
    int [] coordinates = new int [2];
    Figures color;

     void setCoordinates(int[] coordinates, Playground board) {

        if (board.getBoard()[coordinates[0]][coordinates[1]] == Figures.EMPTY) {
            this.coordinates = coordinates;
        }
        else {
            System.out.println("occupied");
        }
    }

    public int[] getCoordinates() {
        return coordinates;
    }

     public Figures getColor() {
         return color;
     }
}

