package student_yurii_panasiuk.lesson_10.level_7;

 class Black_Player extends Players {

     Figures color = Figures.BLACK;

     @Override
     public Figures getColor() { // зачем его переопределять, метод есть в родительском классе?
         return color;
     }
 }
