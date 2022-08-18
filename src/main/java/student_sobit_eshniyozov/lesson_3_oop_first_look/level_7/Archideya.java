package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;


// poka v stadiee razrabotki poka mojno ne proveryat!

class Archideya {
    double height;
    int leaves;
    String variety;
    double age;

    Archideya(String variety, double height, int leaves, double age) {
        this.variety = variety;
        this.height = height;
        this.leaves = leaves;
        this.age = age;
    }

    void parameters() {
        System.out.println("About "+this.variety+":\n" + "Variety is: " + this.variety + " Height is: " + this.height + " Number of leaves: " + this.leaves + " Age of flower: " + this.age);
    }
    void halfAYearLater(){
        System.out.println("Half a year later");
        this.height = this.height+0.2;
        this.age = this.age+0.5;
        this.leaves = this.leaves+2;
        }
   }
