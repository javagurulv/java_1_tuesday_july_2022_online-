package student_levs_blinnikovs.lesson_10_single_responsibility_principle.dev_tech_task;

import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Все таки RiskItem не термин из бизнес задачи. "
		+ "Лучше в коде стараться использовать термины из бизнес задачи: объект.")
class RiskItem {

    private String riskItemName;
    private List<RiskSubItem> riskSubItems;

    RiskItem(List<RiskSubItem> riskSubItems) {
        this.riskSubItems = riskSubItems;
    }

    public List<RiskSubItem> getRiskSubItems() {
        return riskSubItems;
    }

}
