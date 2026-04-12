package TwoPointersSliding;

public class FindTriplets {
    public static void main(String[] args) {
        int[] arr = {-3, -1, -1, 0, 1, 2};
        int target = -2;

        int n = arr.length;

        int count = 0;

        // Basics ===================================================
//        for (int i = 0; i < n - 2; i++) {
//            for (int j = i + 1; j < n - 1; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    count += 1;
//                    System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
//                }
//            }
//        }

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {

                    // Case 1: same elements
                    if (arr[left] == arr[right]) {
                        int len = right - left + 1;
                        count += (len * (len - 1)) / 2;
                        break;
                    }

                    // Case 2: count duplicates
                    int leftCount = 1;
                    int rightCount = 1;

                    while (left + 1 < right && arr[left] == arr[left + 1]) {
                        leftCount++;
                        left++;
                    }

                    while (right - 1 > left && arr[right] == arr[right - 1]) {
                        rightCount++;
                        right--;
                    }

                    count += leftCount * rightCount;

                    left++;
                    right--;
                }

                else if (sum < target) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }
        System.out.println(count);

    }
}
