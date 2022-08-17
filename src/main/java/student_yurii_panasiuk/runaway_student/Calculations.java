package student_yurii_panasiuk.runaway_student;
/*
Условие
В центре круглого бассейна плавает ученик.
Внезапно к бассейну подошёл учитель.
Учитель не умеет плавать, но бегает в 4 раза быстрее, чем ученик плавает.
Ученик бегает быстрее.
Сможет ли он убежать?
*/
class Calculations {

    static double distanse(double x1, double y1, double x2, double y2) {
        double distanse;
        distanse = Math.pow(((Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2), 2))), 0.5);
        return distanse;
    }


}