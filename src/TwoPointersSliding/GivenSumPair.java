package TwoPointersSliding;

import java.util.Arrays;

public class GivenSumPair {

    public static void main(String[] args) {
        GivenSumPair givenSumPair = new GivenSumPair();
        int arr[] = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        int target = 0;
        int count = givenSumPair.countPairs(arr, target);
        System.out.println(count);
    }

    int countPairs(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {

                if (arr[left] == arr[right]) {
                    int n = right - left + 1;
                    count = count + (n * (n - 1)) / 2;
                    break;
                }

                int leftCount = 1;
                while (arr[left] == arr[left + 1] && left + 1 < right) {
                    leftCount++;
                    left++;
                }

                int rightCount = 1;
                while (arr[right] == arr[right - 1] && right - 1 > left) {
                    rightCount++;
                    right--;
                }

                System.out.println(leftCount + "lr" + rightCount);

                count = count + (leftCount * rightCount);

                left++;
                right--;
            }
        }
        return count;
    }
}
