package student_olegs_radigins.lesson_11.level_1.task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class JavaStarLoginServiceImpl implements JavaStarLoginService{
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
