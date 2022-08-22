package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "В корне не правильная модель данных!"
		+ "Что представляет этот класс: одну орхидею или несколько?")
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

    Archideya[] allArchideya;

    Archideya(Archideya[] allArchideya){
        this.allArchideya=allArchideya;
    }

    void halfAYearLater(){
        this.height = this.height+0.2;
        this.age = this.age+0.5;
        this.leaves = this.leaves+2;
        }

    void halfAYearLaterForAll(){
      for(Archideya archideya: allArchideya){
          archideya.halfAYearLater();
      }
        System.out.println("Half a year later");
    }
   }
