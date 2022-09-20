package student_levs_blinnikovs.lesson_11_interfaces.level_1_intern.task_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}
