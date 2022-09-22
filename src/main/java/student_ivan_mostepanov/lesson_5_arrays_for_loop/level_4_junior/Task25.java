package student_ivan_mostepanov.lesson_5_arrays_for_loop.level_4_junior;


import java.util.Scanner;



class Task25 {

    public static void main(String[] args){
        int[] array = createArray();
        fillArrayWithUserNumbers(array);
        printArrayToConsole(array);
    }
    private static int[] createArray (){
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        return new int[arrayLength];
    }

    private static void fillArrayWithUserNumbers(int[] array){
        Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
    }
    private static void printArrayToConsole(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }




}
