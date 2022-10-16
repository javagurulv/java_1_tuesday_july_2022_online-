package student_yurii_panasiuk.lesson_10.level_7;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_10_single_responsibility_principle/codereview/CleanCodeWarning_5.txt")
public class Demo {
    public static void main(String[] args) {

        Playground board = new Playground();
        White_player player1 = new White_player();
        Black_Player player2 = new Black_Player();


        board.boardOutput();
        move(board, player1, player2);
        move(board, player1, player2);
        move(board, player1, player2);
        move(board, player1, player2);
        move(board, player1, player2);
        move(board, player1, player2);move(board, player1, player2);move(board, player1, player2);
        move(board, player1, player2);move(board, player1, player2);




    }


    static void move(Playground board, White_player player1, Black_Player player2){
            firstPlayerTurn(player1, board);
            board.setBoard(player1.getCoordinates(),player1.color);

            secondPlayerTurn(player2, board);
            board.setBoard(player2.getCoordinates(),player2.color);

            board.lowerTheChip(player1.getColor());
            board.lowerTheChip(player2.getColor());
            board.boardOutput();
            board.checkResult(player1.getColor());
            board.checkResult(player2.getColor());

    }


        static void firstPlayerTurn (White_player player1,Playground board) {

            Scanner scanner = new Scanner(System.in);
            int player1Coordinates[] = new int[2];
            player1Coordinates[0] = 0;
            player1Coordinates[1] = scanner.nextInt();
            player1.setCoordinates (player1Coordinates, board);

        }

        static void secondPlayerTurn (Black_Player player2,Playground board) {

            System.out.println("Black player, type your coordinattes");
            Scanner scanner = new Scanner(System.in);
            int player2Coordinates[] = new int[2];
            player2Coordinates[0] = 0;
            player2Coordinates[1] = scanner.nextInt();
            player2.setCoordinates (player2Coordinates, board);
        }



}
