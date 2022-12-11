package student_yurii_panasiuk.lesson_13.level_3;

class TestException extends Exception { }

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception"); // это. Exception кинули и сразу словили
        } finally {
            System.out.println("Inside finally block "); // и это. finally выполняется всегда, в конце try/catch
        }
    }
}

/*Какой результат мы получим?
1. Got the Test Exception // это
   Inside finally block

2. Got the Test Exception

3. Inside finally block

4. Compiler Error


 */