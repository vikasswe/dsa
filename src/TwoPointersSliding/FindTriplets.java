package TwoPointersSliding;

import java.util.Arrays;

public class FindTriplets {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);
        int target = 0;

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int left = i+1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
                    break;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

    }
}
