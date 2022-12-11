package student_yurii_panasiuk.lesson_13.level_3;

 class NullPointerExceptionDemo {

     public static void main(String[] args){

         try {
             String nullStr = null;
             nullStr.toLowerCase();
             // вызывается методкоторму передается пустая ссылка. операция над пустым обьектом.
             // RuntimeException
         }
         catch (NullPointerException exception){
             System.out.print("NullPointerException Caught");
         }

     }
}
