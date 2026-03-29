package gfg;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        NextPermutation nextPermutation = new NextPermutation();
        PivotInfo indexes = nextPermutation.findPivotIndexAndSmallestAfterPivotGreaterThenPivotValueIndex(arr);
        System.out.println("Pivot Index: " + indexes.pivotIndex);
        System.out.println("Next Greater Index: " + indexes.nextGreaterIndex);
        System.out.println("Original  => " + Arrays.toString(arr));
        nextPermutation.swapIndexValues(arr, indexes.pivotIndex, indexes.nextGreaterIndex);
        nextPermutation.reversArray(arr, indexes.pivotIndex, arr.length-1);
    }

    public PivotInfo findPivotIndexAndSmallestAfterPivotGreaterThenPivotValueIndex(int[] arr) {
        // start from right to find pivot
        int pivotIndex = -1;
        int nextGreaterIndex = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivotIndex = i;
                break;
            }
        }

        int j = arr.length - 1;
        while (arr[j] < arr[pivotIndex]) {
            j--;
        }

        nextGreaterIndex = j;

        return new PivotInfo(pivotIndex, nextGreaterIndex);
    }

    public void swapIndexValues(int[] arr, int pivotIndex, int nextGreaterIndex) {
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[nextGreaterIndex];
        arr[nextGreaterIndex] = temp;

        System.out.println("After swapped  => " + Arrays.toString(arr));
    }

    public void reversArray(int []arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("After reversed  => " + Arrays.toString(arr));
    }

}
