package student_yurii_panasiuk.lesson_10.level_7;

 class White_player extends Players {

     Figures color = Figures.WHITE;

     @Override
     public Figures getColor() { // зачем его переопределять, метод есть в родительском классе?
         return color;
     }
 }
