package student_yurii_panasiuk.lesson_8.level_4.task_14_19;

 class ShapeUtil {


     public static void main(String[] args) {

         ShapeUtil randomCircle = new ShapeUtil();
         // randomCircle.createRandomCircle();
         System.out.println((int)randomCircle.createRandomCircle().getRadius());

         ShapeUtil randomSquare = new ShapeUtil();
         //randomSquare.createRandomSquare();
         System.out.println((int)randomSquare.createRandomSquare().getSide());

         ShapeUtil randomRectangle = new ShapeUtil();
         //randomRectangle.createRandomRectangle();
         System.out.println((int)randomRectangle.createRandomRectangle().getSideOne() + "  " +
                 (int)randomRectangle.createRandomRectangle().getSideTwo());


     }

     Rectangle createRandomRectangle(){
         int minRanom = 1;
         int maxRanom = 10;
         int randomSide1 = (int)Math.round (minRanom + (Math.random () * maxRanom));
         int randomSide2 = (int)Math.round (minRanom + (Math.random () * maxRanom));
         Rectangle randomRectangle = new Rectangle("Random Rectangle", randomSide1, randomSide2);

         return randomRectangle;

     }

     Circle createRandomCircle() {
            int minRanomRadius = 1;
            int maxRanomRadius = 10;
            int randomRadius = (int)Math.round (minRanomRadius + (Math.random () * maxRanomRadius));
            Circle randomCircle = new Circle("RandomCircle", randomRadius);

            return randomCircle;
         }


    Square createRandomSquare() {
        int minRanomSide = 1;
        int maxRanomSide = 10;
        int randomSide = (int)Math.round (minRanomSide + (Math.random () * maxRanomSide));
        Square randomSquare = new Square("RandomSquare", randomSide);

        return randomSquare;
        }

     }




