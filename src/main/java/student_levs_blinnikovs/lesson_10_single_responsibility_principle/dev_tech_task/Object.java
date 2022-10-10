package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)

class Object {

    private List<SubObject> subObjects;

    Object(List<SubObject> subObjects) {
        this.subObjects = subObjects;
    }

    public List<SubObject> getRiskSubItems() {
        return subObjects;
    }

}
