package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7_levs;

// этот класс будет для совершения действий на всех обьектах орхидей

class OrchidFarm {

    // передадим ферме возможность работать с коллекциями обьектов
    Orchid[] orchids;

    OrchidFarm(Orchid[] orchids) {  // через конструктор передаем коллекцию орхидей в класс
        this.orchids = orchids;
    }

    // сделаем метод который делает с этими коллекциями какие-то действия

    void increaseAllFarmAgeByHalfYear() {
        for (Orchid orchid : orchids) {
            orchid.increaseAgeByHalfYear();
        }
        System.out.println("All farm has aged half a year!");
    }

}
