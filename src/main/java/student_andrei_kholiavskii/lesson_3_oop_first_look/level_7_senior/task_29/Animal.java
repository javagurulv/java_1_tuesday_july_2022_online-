package student_andrei_kholiavskii.lesson_3_oop_first_look.level_7_senior.task_29;

class Animal {

    String animalType;
    int animalQuantity;
    String animalHabitat;

    Animal(String animalType, int animalQuantity, String animalHabitat) {
        this.animalType = animalType;
        this.animalQuantity = animalQuantity;
        this.animalHabitat = animalHabitat; }

    void animalInfo() {
        System.out.println("The animal we are speaking about is " + animalType + ". It usually lives in a group of " + animalQuantity + " species. Their habitat is " + animalHabitat + ".");}

    void changeHabitat(String animalHabitat) {
        this.animalHabitat = animalHabitat;
        System.out.println("These animals are always looking for better and more comfortable existence, so they move to " + this.animalHabitat + " for several months.");}
}
