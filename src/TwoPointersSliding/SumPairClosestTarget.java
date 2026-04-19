package TwoPointersSliding;

import java.util.ArrayList;
import java.util.Arrays;

public class SumPairClosestTarget {

    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 5};
        int target = 25;

        SumPairClosestTarget obj = new SumPairClosestTarget();
        System.out.println(obj.sumClosest(arr, target));
    }

    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;

        if (arr.length < 2) {
            return result;
        }

        // SORT ARRAY (VERY IMPORTANT)
        Arrays.sort(arr);

        int bestDiff = Integer.MAX_VALUE;

        while (left < right) {

            int a = arr[left];
            int b = arr[right];
            int sum = a + b;

            int currentDiff = Math.abs(target - sum);

            if (currentDiff < bestDiff) {
                bestDiff = currentDiff;

                result.clear();
                result.add(a);
                result.add(b);
            } else if (currentDiff == bestDiff) {
                int oldGap = Math.abs(result.get(0) - result.get(1));
                int newGap = Math.abs(a - b);

                if (newGap > oldGap) {
                    result.clear();
                    result.add(a);
                    result.add(b);
                }
            }

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                left++;
                right--;
            }

        }

        return result;
    }

}
