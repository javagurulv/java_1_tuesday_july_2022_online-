package student_jelena_voinica.lesson_6;

public class WhileInfiniteLoopBreak {
    public static void main(String[]args){
        int i = 1;
        int a = 5;
        while(i<=7){
            System.out.println(i + ":Test!");
            if(i==a)
                break;
            i++;
        }
    }
}
