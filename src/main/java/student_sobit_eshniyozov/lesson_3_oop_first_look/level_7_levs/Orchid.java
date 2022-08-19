package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7_levs;

class Orchid { // первое изменение - название сделал по английски
    double height;
    int numberOfLeaves;  // тут я бы предложил numberOfLeaves потому что просто листы это можно по разному понять.. или leavesCount
    String variety;
    double age;

    Orchid(String variety, double height, int numberOfLeaves, double age) {
        this.variety = variety;
        this.height = height;
        this.numberOfLeaves = numberOfLeaves;
        this.age = age;
    }

    void printParameters() {    // этот метод печатет параметры. Так что лучше его назвать printParameters или showParameters ... в таком духе
        System.out.println("About "+this.variety+":\n" + "Variety is: " + this.variety + " Height is: " + this.height + " Number of leaves: " + this.numberOfLeaves + " Age of flower: " + this.age);
    }
    void increaseAgeByHalfYear(){                            // не совсем понял почему используешь единицу пол года но может так по бизнесу, так что тут ничего не меняю
        this.height = this.height + 0.2;
        this.age = this.age + 0.5;
        this.numberOfLeaves = this.numberOfLeaves + 2;
        }                                           // убрал тут принт потому что этот метод только чтобы сделать всех старше
   }
