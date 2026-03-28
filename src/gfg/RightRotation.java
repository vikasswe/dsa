package gfg;

public class RightRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

//        rotateRight(arr, 3);
//        rotateLeft(arr, 3);
        System.out.println("Final 3 → " + java.util.Arrays.toString(arr));

    }

    //step 1 write a logic to reverse an array
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // for right rotation last k elements will be first
    public static void rotateRight(int[] arr, int k) {
        // Find out the mod (Start from right and make those first)
        int mod = k % arr.length;

        //First rotate complete
        reverse(arr, 0, arr.length - 1);

        // Then rotate first k into same format
        reverse(arr, 0, mod - 1);

        // Then rotate last into the same format of original
        reverse(arr, mod, arr.length - 1);

    }

    public static void rotateLeft(int[] arr, int k) {
        // Do the same for left (Start from Left and make those last)
        int mod = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        System.out.println("Reverse → " + java.util.Arrays.toString(arr));
        reverse(arr, arr.length - mod, arr.length - 1);
        System.out.println("Fix order of targeted elements → " + java.util.Arrays.toString(arr));
        reverse(arr, 0, arr.length - 1 - mod);
        System.out.println("Fix order or rest elements → " + java.util.Arrays.toString(arr));
    }

}
