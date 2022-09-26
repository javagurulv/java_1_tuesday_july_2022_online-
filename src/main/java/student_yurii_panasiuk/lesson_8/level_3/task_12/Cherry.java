package student_yurii_panasiuk.lesson_8.level_3.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Cherry extends Tree {

     public Cherry(int treeHeight) {
         super(treeHeight);
     }

     @Override
     void setTreeHeight (int treeHeight){
         this.treeHeight = treeHeight;
     }

 }
