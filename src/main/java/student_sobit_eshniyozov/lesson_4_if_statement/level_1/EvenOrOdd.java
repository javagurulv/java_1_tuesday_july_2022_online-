package student_sobit_eshniyozov.lesson_4_if_statement.level_1;

//        Написать программу, которая запрашивает у пользователя
//        целое число и выводит на консоль чётное оно или нет.
//
//        Подсказка: используйте для определения чётное число или нет
//        операцию остаток от деления (%). Если остаток от деления на 2
//        равен нулю то число чётное, иначе не чётное.

import java.util.Scanner;

class EvenOrOdd {
    int inPut;

    EvenOrOdd(){this.inPut=inPut;}

    void showEvenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number: ");
        inPut = sc.nextInt();
        if (inPut%2==0) {
            System.out.println("Number is Even!");
        }
           else{
                System.out.println("Number is Odd!");
           }
        }
}

