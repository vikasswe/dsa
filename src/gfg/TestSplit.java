package gfg;

import java.util.Arrays;

class TestSplit {
    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 10};
        int k = 2;

        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {

            System.out.println("\nSplit at index " + i);

            int[] temp = new int[n];

            for (int j = 0; j < n; j++) {
                System.out.println(j + " ===Before split=== " + i);
                if (j <= i) {
                    temp[j] = arr[j] + k;   // LEFT side = +k
                } else {
                    temp[j] = arr[j] - k;   // RIGHT side = -k
                }
            }

            System.out.println("After split:");
            System.out.println(Arrays.toString(temp));
        }
    }
}