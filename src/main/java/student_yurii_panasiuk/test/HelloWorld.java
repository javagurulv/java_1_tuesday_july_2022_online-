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


        int minRanomRadius = 1;
        int maxRanomRadius = 10;
        int randomRadius = (int)Math.round (minRanomRadius + (Math.random () * maxRanomRadius));

        System.out.println(randomRadius);
        randomRadius = (int)Math.round (minRanomRadius + (Math.random () * maxRanomRadius));
        System.out.println(randomRadius);
         randomRadius = (int)Math.round (minRanomRadius + (Math.random () * maxRanomRadius));
        System.out.println(randomRadius);
     randomRadius = (int)Math.round (minRanomRadius + (Math.random () * maxRanomRadius));
        System.out.println(randomRadius);

    }
}
