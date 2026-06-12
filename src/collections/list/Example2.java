package collections.list;

import java.util.*;

public class Example2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(45);
        list.add(80);
        list.add(60);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        int sum = 0;
        int max = 0;
        int even = 0;

        for (int data : list) {
            sum += data;
            if (max < data) {
                max = data;
            }

            if (data % 2 == 0) {
                even += 1;
            }
        }

        System.out.println("Sum => " + sum);
        System.out.println("Max => " + max);
        System.out.println("Even num => " + even);

        List<Integer> rev = reverseList(list);
        System.out.println("Rev => " + rev);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 != 0) {
//                list.set(i, -1);
//            }
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 != 0) {
//                list.set(i, -1);
//            }
//        }
//
//        System.out.println("After -1 => " + list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);

        list.addAll(list2);
        Set<Integer> set = withoutDuplicate(list);
        System.out.println("Remove duplicate => " + set);

        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(arr);

        Collections.sort(list);
        System.out.println("Sorted => " + list);
        System.out.println("Contains => " + list.contains(40));

        Map<Integer, Integer> map = itemCount(list);

        System.out.println("Count => " + map);

        //custom sort
        Collections.sort(list, (o1, o2) -> o2 - o1);

        System.out.println(list);
    }

    public static List<Integer> reverseList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            System.out.println(left + " == " + right);
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
        return list;
    }

    public static Set<Integer> withoutDuplicate(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list);

        return set;
    }

    public static Map<Integer, Integer> itemCount(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : list) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, count + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map;
    }

}
