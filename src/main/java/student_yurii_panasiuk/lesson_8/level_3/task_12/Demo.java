package student_yurii_panasiuk.lesson_8.level_3.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Demo {

    public static void main(String[] args) {

    Cherry cherryTree1 = new Cherry(10);

    Apricot apricotTree1 = new Apricot(5);

        cherryTree1.setTreeHeight((cherryTree1.getTreeHeight()) + 1);
        apricotTree1.setTreeHeight((apricotTree1.getTreeHeight()) + 1);

        System.out.println(cherryTree1.getTreeHeight());
        System.out.println(apricotTree1.getTreeHeight());


}
}
