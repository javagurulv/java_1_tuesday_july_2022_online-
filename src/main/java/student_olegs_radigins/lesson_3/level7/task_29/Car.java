package student_olegs_radigins.lesson_3.level7.task_29;

class Car {
    String type;
    String typeOfFuel;
    Double engineVolume;
    String color;

    public Car(String type, String typeOfFuel, Double engineVolume, String color) {
        this.type = type;
        this.typeOfFuel = typeOfFuel;
        this.engineVolume = engineVolume;
        this.color = color;
    }
    void description(){
        System.out.println("It is a " + color + " " + type + " with a " + engineVolume + " liter " + typeOfFuel + " engine." );
    }
    void changeColor(String newColor){
        this.color = newColor;
    }
}
