package student_yurii_panasiuk.lesson_7.level_1_2_3.task_1_2_3_4;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WordServiceTests {

    public static void main(String[] args) {

        processingTest();
        listOfRespsTest();
        findMaxCoordinatesTest();

    }

    static void findMaxCoordinatesTest () {
       WordService test = new WordService();
       List<Integer> text =  Arrays.asList (2, 2, 1, 1, 2, 2);

       System.out.print("findMaxCoordinates test - ");

       testResult((test.findMaxCoordinates(text))==0);
    }

    static void listOfRespsTest (){
        WordService test = new WordService();
        String [] text = new String [] {"Дана", "строка", "с", "текстом", "Дана", "строка"} ;

        System.out.print("listOfResps test - ");

        testResult(Objects.equals((test.listOfResps(text)), (Arrays.asList(2, 2, 1, 1, 2, 2)) ));
    }

    static void processingTest () {
        WordService test = new WordService();
        String text = "Дана строка с текстом. Дана  строка.";

        System.out.print("processing test - ");

        testResult((Arrays.toString(test.processing(text)).equals("[Дана, строка, с, текстом, Дана, строка]")));
    }

    static void testResult(boolean check) {
        if (check){ System.out.println(" OK");}
        else {System.out.println(" FAIL");}
    }
}
