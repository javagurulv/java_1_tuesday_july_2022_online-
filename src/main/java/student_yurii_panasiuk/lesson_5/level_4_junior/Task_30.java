package student_yurii_panasiuk.lesson_5.level_4_junior;
/*Напишите программу, в которой:
- создайте массив произвольной длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива;
- найдите все нечётные числа в массиве и выведите их на консоль.

 */
public class Task_30 {

    public static void main(String[] args) {

        int randomUpperLevel =10;
        int randomLowerLevel=1;
        Integer[] numbers = new Integer[(int) (Math.random() * randomUpperLevel)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int) (randomLowerLevel+Math.random() * randomUpperLevel);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2 > 0)
            System.out.print(numbers[i] + " ");
        }

}
}