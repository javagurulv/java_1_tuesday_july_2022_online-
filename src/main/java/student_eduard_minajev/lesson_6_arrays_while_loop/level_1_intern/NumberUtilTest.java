package student_eduard_minajev.lesson_6_arrays_while_loop.level_1_intern;

public class NumberUtilTest {

    public static void main(String[] args){
        NumberUtilTest check = new NumberUtilTest();
        check.isEvenTest();


    }


    public boolean isEvenTest (){
        int checkNumber = 8;
        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean actualResult = numberUtils.isEven(checkNumber);
        if (actualResult == expectedResult) {System.out.println("Test Ok");
        } return true;
    }

}
