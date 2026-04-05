package TwoPointersSliding;

public class PairTargetSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 6;

        int left = 0;
        int right = arr.length - 1;
        int countPairs = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Found: " + arr[left] + ", " + arr[right]);
                countPairs += 1;
                // this is for all Values that meets with target
//                right--;
//                left++;
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(countPairs);
    }
}
