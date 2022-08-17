package student_yurii_panasiuk.runaway_student;


// создаем учителя [Х1, Х2, Y1, Y2, R]

class Teacher {

    double [] teacher;

    Teacher(double[] teacher) {
        this.teacher = teacher;
    }

    double[] getCoordinates () { return this.teacher; }

}
