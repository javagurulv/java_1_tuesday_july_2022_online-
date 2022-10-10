package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Policy {

    private String policyNumber;
    private PolicyStatus policystatus;
    private List<Object> objects;

    Policy(List<Object> objects) {
        this.objects = objects;
    }

    public List<Object> getRiskItems() {
        return objects;
    }
}
