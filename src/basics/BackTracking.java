package basics;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6};
        subsets(arr, 0, new ArrayList<>());
    }

    static void subsets(int[] arr, int i, List<Integer> temp) {
        System.out.println("Method call iteration => " + i);
        if (i == arr.length) {
            System.out.println(temp);
            System.out.println("================================== condition match =================================");
            return;
        }

        System.out.println("I before BackTracking => " + i);
        temp.add(arr[i]);
        subsets(arr, i + 1, temp);

        System.out.println("I Before remove => " + i);
        temp.remove(temp.size() - 1);
        subsets(arr, i + 1, temp);
    }

}
