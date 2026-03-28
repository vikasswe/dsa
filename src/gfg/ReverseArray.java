package gfg;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = {1, 4, 3, 2, 6, 5};

        ReverseArray reverseArray = new ReverseArray();
        int[] newArr = reverseArray.reverseArr(arr);

        System.out.println(Arrays.toString(newArr));

    }

    public int[] reverseArr(int arr[]) {

        for (int i = 0; i < arr.length/2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - (i+1)];
            arr[arr.length - (i+1)] = temp;
        }

        return arr;
    }

}
