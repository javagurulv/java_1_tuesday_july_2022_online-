package student_yurii_panasiuk.lesson_4.level_3_junior;



import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Task_10 {

    public static void main(String[] args) {
        System.out.println("Введите чило первое целое число");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Введите чило второе целое число");
        int number2 = scanner.nextInt();

        System.out.println("Введите чило третье целое число");
        int number3 = scanner.nextInt();


        int extra;
        if (number1 > number2) {
            extra = number1;
        }
        else {
            extra = number2;
        }

        if (extra < number3){
            extra = number3;
        }

        System.out.println(extra);

    }

    }
