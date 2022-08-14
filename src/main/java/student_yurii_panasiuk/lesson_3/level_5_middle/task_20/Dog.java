package student_yurii_panasiuk.lesson_3.level_5_middle.task_20;

class DogTask20 {

    String nick = "Dog";
    int dogAge = 1;

    DogTask20(String nick, int dogAge) {this.nick = nick; this.dogAge = dogAge;}

     DogTask20() {

    }

    void voice ()  {System.out.println (nick + " " + dogAge + " years old");}

    void happyBirthday() {
        dogAge++;
    }


}
