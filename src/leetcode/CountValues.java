package leetcode;

import java.util.Iterator;
import java.util.Map;

public class CountValues {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "d", "c", "u", "u", "xy", "d", "b", "r"};

        FindCount findCount = new FindCount();

        Map<String, Integer> result = findCount.findAndCount(arr);

        System.out.println(result);

        Map.Entry<String, Integer> first = result.entrySet().iterator().next();
        System.out.println("First: " + first);

        Map.Entry<String, Integer> max = result.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();
        System.out.println("Max: " + max);

        Map.Entry<String, Integer> min = result.entrySet().stream()
                .min(Map.Entry.comparingByValue()).get();
        System.out.println("Min: " + min);

    }

}


