package basics;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    static void solve(int idx, int[] arr, List<Integer> ds) {
        System.out.println("Idx => " + idx);
        System.out.println("arr => " + arr);
        System.out.println("ds =>" + ds);
        if (idx == arr.length) {
            System.out.println("Base match => " + ds);
            return;
        }

        // PICK
        System.out.println("Picking => " + arr[idx]);
        ds.add(arr[idx]);
        System.out.println("Recursion call => " + idx + 1 + "arr => " + arr + "ds => " + ds);
        solve(idx + 1, arr, ds);

        // BACKTRACK
        System.out.println("Backtrack => " + ds.size() + "Idx => " + idx);
        ds.remove(ds.size() - 1);

        // NOT PICK
        System.out.println("Not pick => " + idx + 1 + "arr => " + arr + "ds => " + ds);
        solve(idx + 1, arr, ds);
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6};

        solve(0, arr, new ArrayList<>());
    }

}
