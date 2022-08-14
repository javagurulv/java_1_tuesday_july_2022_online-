package student_eduard_minajev.lesson_3_oop_first_look.homework.level_3_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Cyborg {

    String cyborgName;
    String cyborgStatus;

    Cyborg (String cyborgName, String cyborgStatus) {
        this.cyborgName=cyborgName;
        this.cyborgStatus=cyborgStatus;
    }
    void nameReport() {System.out.println(this.cyborgName + " says- This unit name is: " + this.cyborgName);}
    void statusReport() {System.out.println(this.cyborgName + " says - This unit status is: " + this.cyborgStatus);}

    void reName (String newCyborgName) {
        this.cyborgName=newCyborgName;
    }

    void setNewStatus (String newCyborgStatus) {
        this.cyborgStatus=newCyborgStatus;
    }


}
