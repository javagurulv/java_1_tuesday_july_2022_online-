package student_yurii_panasiuk.lesson_8.level_4.task_14_19;

 class ShapeUtil {


     public static void main(String[] args) {

         ShapeUtil circleRandomOne = new ShapeUtil();
         circleRandomOne.createRandomCircle();
         System.out.println((int)circleRandomOne.createRandomCircle().getRadius());
     }

     Circle createRandomCircle() {
            int minRanomRadius = 1;
            int maxRanomRadius = 10;
            int randomRadius = (int)Math.round (minRanomRadius + (Math.random () * maxRanomRadius));
            Circle randomCircle = new Circle("RandomCircle", randomRadius);

            return randomCircle;
         }
     }




