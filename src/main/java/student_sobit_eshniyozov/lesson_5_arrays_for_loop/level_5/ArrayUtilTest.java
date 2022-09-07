package student_sobit_eshniyozov.lesson_5_arrays_for_loop.level_5;

//    public static void main(String[] args) {
//        ArrayUtilTest test = new ArrayUtilTest();
//        test.shouldCreateArray();
//    }
//
//
//
//
//    public void shouldCreateArray() {
//
//        int arrayLength = 6;
//        ArrayUtil arrayUtil = new ArrayUtil();
//        arrayUtil.createArray(arrayLength);
//
//        // Напишите реализацию !!!
//        // Проверьте, что метод создаёт массив указанной длины
//    }

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

    public void shouldCreateArray() {

        // напишем тест на createArray()
        // любой тест выполняется в 3 шага.
        // 1. подготавливаем тест данные. Мы хотим протестить метод которому подаёшь длину и он создает массив.
        // Нам понадобится обьект на котором вызвать наш метод, и ожидаемая длина.

        int expectedArrayLength = 6;  // Ожидаемая длина
        ArrayUtil arrayUtil = new ArrayUtil(); // обьект на котором можем вызывать наш метод

        // второй шаг это вызов продакшн кода, чтобы проверить работает ли массив как мы ожидаем
        int[] realArray = arrayUtil.createArray(expectedArrayLength); // вызываем код и сразу записываем результат в переменную чтобы её сравнивать
        // тоесть тут мы проверяем, если мы ожидаемую длину подадим в метод, вернет cделает ли он такой массив как нам нужен?

        // третий шаг это сравним длину созданного массива с нашей ожидаемой
        if (realArray.length == expectedArrayLength) { // тут используем свойство length чтобы проверить, движок жавы отдаст такую же длинну как и ту что мы ожидаем?
            // Можно просто вместо expected писать цифры, но так лучше, чтобы потом легче менять
            System.out.println("TEST OK");
        } else System.out.println("TEST NOT OK");

        // писать можно по разному. попробуй разные варианты. У меня в тестах можешь посмотреть много вариантов и так же как прятать проверку в другой метод итд

    }

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray(); // запускаем тест!


    }
}
