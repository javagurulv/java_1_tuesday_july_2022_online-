package student_yurii_panasiuk.lesson_12.level_1.task_1;

import javax.management.AttributeList;
import javax.management.relation.RoleList;
import javax.management.relation.RoleUnresolvedList;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class ListImplementing {

    AbstractList <String> one = new ArrayList<String>();
    AbstractSequentialList<String> two = new LinkedList<String>();
    List<String>  three = new ArrayList<String>();
    List<String> four = new AttributeList<String>();
    List<String> five = new CopyOnWriteArrayList<String>();
    List<String> six = new LinkedList<String>();
    List<String> seven = new RoleList<String>();
    List<String> eight = new RoleUnresolvedList<String>();
    List<String> nine = new Stack<String>();
    List<String> ten = new Vector<String>();

}
