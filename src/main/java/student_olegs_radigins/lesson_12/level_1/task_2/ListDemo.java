package student_olegs_radigins.lesson_12.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

class ListDemo {
    public static void main(String[] args) {


        List<String> demo = new ArrayList<>();
        demo.add("apple");
        demo.add("pear");
        demo.add("banana");
        System.out.println(demo);

        List<Fruits> demo2 = new ArrayList<>();
        Fruits apple = new Fruits("apple","red");
        Fruits pear = new Fruits("pear", "green");
        Fruits banana = new Fruits("banana", "yellow");
        demo2.add(apple);
        demo2.add(pear);
        demo2.add(banana);
        System.out.println(demo2);

    }
}
    class Fruits{
    String name;
    String color;

        public Fruits(String name, String color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Fruits{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
