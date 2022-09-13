package student_olegs_radigins.lesson_4.level_5;

class LightColorDetector {
    String violet = "Violet";
    String blue = "Blue";
    String green = "Green";
    String yellow = "Yellow";
    String orange = "Orange";
    String red = "Red";
    String invisibleLight = "Invisible Light";

    public String detect(int wavelength) {
        if ((wavelength > 380) && (wavelength < 449)) {
            return violet;
        } else if ((wavelength > 450) && (wavelength < 494)) {
            return blue;
        } else if ((wavelength > 495) && (wavelength < 569)) {
            return green;
        } else if ((wavelength > 570) && (wavelength < 589)) {
            return yellow;
        } else if ((wavelength > 590) && (wavelength < 619)) {
            return orange;
        } else if ((wavelength > 620) && (wavelength < 750)) {
            return red;
        } else {
            return invisibleLight;
        }
    }

}


