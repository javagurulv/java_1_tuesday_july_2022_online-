package student_ivan_mostepanov.lesson_5_arrays_for_loop.level_4_junior.find_numbers;

import static student_ivan_mostepanov.lesson_5_arrays_for_loop.level_4_junior.find_numbers.FindNumbersInArray.*;

class FindNumbersInArrayDemo {

    public static void main(String[] args) {

        int sizeArray = createArrayLength();
        int[] newArray = createNewArray(sizeArray);
        fillArrayWithRandomNumbers(newArray);
        printArrayToConsole(newArray);
        findMaxNumber(newArray);
        findMinNumber(newArray);
        findEvenNumber(newArray);
        findOddNumber(newArray);



    }




}
