package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7_levs;

class OrchidFarmDemo {

    public static void main(String[] args) {

        // объекты пока насоздаем сдесь вручную, потом можем попробовать через циклы

        Orchid orchid1 = new Orchid("ZeroOrchid", 0,0,0);
        Orchid orchid2 = new Orchid("MicroOrchid", 0.1,1,0);
        Orchid orchid3 = new Orchid("OldOrchid", 5.2,14,10);

        // пихаем их все в массив

        Orchid[] orchids = {orchid1, orchid2, orchid3};

        // создаем тест обьект - передаем ему массив орхидей
        OrchidFarm test = new OrchidFarm(orchids);

        // вызываем наш метод
        test.increaseAllFarmAgeByHalfYear();

        orchid1.printParameters();
        orchid2.printParameters();
        orchid3.printParameters();


        // теперь можно вызывать несоклько раз.

        test.increaseAllFarmAgeByHalfYear();
        test.increaseAllFarmAgeByHalfYear(); // третье полугодие

        orchid1.printParameters();
        orchid2.printParameters();
        orchid3.printParameters();

        // можно в цикле это вызывать но попытайся лучше сделать метод в OrchidFarm которому задаешь, сколько полугодий прошло, и он должен отработать столько раз.

        for (int i = 0; i < 100; i++) {
            test.increaseAllFarmAgeByHalfYear();
            System.out.println(i + 1 + " half years have passed...");
        }

        // печетать в цикле тоже можно

        for (int i = 0; i < orchids.length; i++) {
            Orchid orchid = orchids[i];
            orchid.printParameters();
        }


    }
}
