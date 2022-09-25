package student_yurii_panasiuk.lesson_8.level_3.task_12;

abstract class Tree {
    protected int treeHeight;

    protected Tree(int treeHeight) {
        this.treeHeight = treeHeight;
    }

      protected int getTreeHeight() {
        return treeHeight;
    }

    abstract void setTreeHeight(int treeHeight);
}
