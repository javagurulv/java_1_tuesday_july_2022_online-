package student_yurii_panasiuk.lesson_12.level_1.task_1;

import javax.management.AttributeList;
import javax.management.relation.RoleList;
import javax.management.relation.RoleUnresolvedList;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class ListImplementing {

    AbstractList <String> one = new ArrayList<>();
    AbstractSequentialList<String> two = new LinkedList<>();
    List<String>  three = new ArrayList<>();
    AttributeList four = new AttributeList();
    List<String> five = new CopyOnWriteArrayList<>();
    LinkedList<String> six = new LinkedList<>();
    List seven = new RoleList();
    List eight = new RoleUnresolvedList();
    List<String> nine = new Stack<>();
    List<String> ten = new Vector<>();

}
