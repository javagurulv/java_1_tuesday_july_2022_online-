package teacher.lesson_10_single_responsibility_principle.lessoncode.businesslogic;

import teacher.lesson_10_single_responsibility_principle.lessoncode.domain.Policy;

public interface PremiumCalculator {

	double calculate(Policy policy);

}
