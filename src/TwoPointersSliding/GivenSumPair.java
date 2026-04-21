package TwoPointersSliding;

public class GivenSumPair {

    public static void main(String[] args) {
        GivenSumPair givenSumPair = new GivenSumPair();
        int arr[] = {-1, 1, 5, 5, 7};
        int target = 6;
        int count = givenSumPair.countPairs(arr, target);
        System.out.println(count);
    }

    int countPairs(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        int sum = arr[left] + arr[right];
        int count = 0;

        while (left < right) {
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                count++;
                left++;
                right--;
            }
        }
        System.out.println(count);
        return count;
    }
}
