package student_yurii_panasiuk.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HelloWorld{
    public static void main(String []args) {
        List<String> list = Arrays.asList("Hello", "World");
        List<Integer> data = new ArrayList(list); // как String Integer совместились?
      //  Integer intNumber = data.get(0);
       System.out.println(data);
    }
}
