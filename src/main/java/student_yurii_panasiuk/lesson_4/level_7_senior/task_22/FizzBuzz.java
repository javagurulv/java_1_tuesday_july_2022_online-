package student_yurii_panasiuk.lesson_4.level_7_senior.task_22;

 class FizzBuzz {

    void detect(int wavelength) {

        if (wavelength < 380 || wavelength > 750) {System.out.println("Invisible Light");}
        else if (wavelength >= 380 && wavelength <= 449) {System.out.println("Violet");}
        else if (wavelength >= 450 && wavelength <= 494) {System.out.println("Blue");}
        else if (wavelength >= 495 && wavelength <= 569) {System.out.println("Green");}
        else if (wavelength >= 570 && wavelength <= 589) {System.out.println("Yellow");}
        else if (wavelength >= 590 && wavelength <= 619) {System.out.println("Orange");}
        else if (wavelength >= 620 && wavelength <= 750) {System.out.println("Red");}
    }

}
