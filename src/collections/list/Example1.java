package collections.list;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("java");
        list.add("python");

        System.out.println(list);

        //This is for update
        list.set(1, "hello");

        System.out.println(list.indexOf(0));

        list.remove(1);

        System.out.println(list.contains("python"));

        System.out.println("This is last code");
        for (String s : list) {
            System.out.println(s);
        }

    }

}
