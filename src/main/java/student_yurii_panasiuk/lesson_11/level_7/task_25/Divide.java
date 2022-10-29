package student_yurii_panasiuk.lesson_11.level_7.task_25;

import java.text.DecimalFormat;

class Divide implements Strategy{
    @Override
    public String doOperation (double numberOne, double numberTwo) {
        DecimalFormat df = new DecimalFormat("###.###");
        double result = numberOne / numberTwo;
        return  df.format (result);
    }
}

