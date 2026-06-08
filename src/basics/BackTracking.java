package basics;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6};
        subsets(arr, 0, new ArrayList<>());
    }

    static void subsets(int[] arr, int i, List<Integer> temp) {

        System.out.println("\n➡ ENTER CALL i = " + i + " temp = " + temp);

        if (i == arr.length) {
            System.out.println("✔ BASE CASE HIT i = " + i + " temp = " + temp);
            return;
        }

        // TAKE
        System.out.println("👉 TAKE i = " + i + " value = " + arr[i]);
        temp.add(arr[i]);
        System.out.println("temp after add = " + temp);

        subsets(arr, i + 1, temp);

        // BACKTRACK
        System.out.println("🔙 BACKTRACK i = " + i + " removing = " + temp.get(temp.size() - 1));
        temp.remove(temp.size() - 1);
        System.out.println("temp after remove = " + temp);

        // DON'T TAKE
        System.out.println("👉 DON'T TAKE i = " + i);

        subsets(arr, i + 1, temp);

        System.out.println("⬅ EXIT CALL i = " + i + " temp = " + temp);
    }

}
