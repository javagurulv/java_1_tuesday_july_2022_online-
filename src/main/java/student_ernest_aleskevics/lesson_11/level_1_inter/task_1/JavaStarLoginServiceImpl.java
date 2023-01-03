package student_ernest_aleskevics.lesson_11.level_1_inter.task_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
