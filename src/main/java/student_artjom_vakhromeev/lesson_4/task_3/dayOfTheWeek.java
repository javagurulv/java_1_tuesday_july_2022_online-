package student_artjom_vakhromeev.lesson_4.task_3;

public class dayOfTheWeek {
    int dayOfTheWeek;

    public dayOfTheWeek(int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    void printDayOfTheWeek(){
        switch(dayOfTheWeek){
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default: System.err.println("No such day !");




        }










    }
}
