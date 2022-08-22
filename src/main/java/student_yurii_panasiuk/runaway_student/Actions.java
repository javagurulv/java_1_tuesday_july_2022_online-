package student_yurii_panasiuk.runaway_student;
/*
Условие
В центре круглого бассейна плавает ученик.
Внезапно к бассейну подошёл учитель.
Учитель не умеет плавать, но бегает в 4 раза быстрее, чем ученик плавает.
Ученик бегает быстрее.
Сможет ли он убежать?
*/
class Actions {

    static double getDistanse(double x1, double y1, double x2, double y2) {
        double distanse;
        distanse = Math.pow(((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2))), 0.5);
        return distanse;
    }

    static double[] vektorDescription(double x1, double y1, double x2, double y2) {
        double vektorX = (x2 - x1);
        double vektorY = (y2 - y1);
        double[] vektor = new double[]{vektorX, vektorY};
        return vektor;
    }

    static double[] ortDescription(double[]vektorDescription, double getDistanse) {
        double ortX = (vektorDescription[0]) / getDistanse;
        double ortY = (vektorDescription[1]) / getDistanse;
        double[] ort = new double[]{ortX, ortY};
        return ort;
    }

    static double[] studentMove(double[] vektorDescription, double[] ortDescription) {
        double[] studentMoveVector = new double[]{vektorDescription[0] + ortDescription[0], vektorDescription[1] + ortDescription[1]};
        return studentMoveVector;
    }

   public static void main(String[] args) {
     Student student = new Student( new double[] {0, 0, 0, 0, 0});

     Teacher teacher = new Teacher( new double[] {1, 1, 1, 1, 100});

       System.out.println (teacher.getCoordinates()[1]);
       System.out.println(getDistanse(student.getCoordinates()[0], student.getCoordinates()[1], teacher.getCoordinates()[0], teacher.getCoordinates()[1]));
       System.out.println(vektorDescription(student.getCoordinates()[0], student.getCoordinates()[1], teacher.getCoordinates()[0], teacher.getCoordinates()[1])[0]
               + " " +
               vektorDescription(student.getCoordinates()[2], student.getCoordinates()[3], teacher.getCoordinates()[2], teacher.getCoordinates()[3])[1]);

       ;













}
}
