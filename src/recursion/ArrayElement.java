package recursion;

public class ArrayElement {

    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 7, 3, 6, 4, 2, 1};

        printElement(arr, arr.length - 1);

        int data = sumOfArray(arr, arr.length - 1);

        System.out.println(data);
    }

    static void printElement(int[] arr, int index) {

        if (index < 0) {
            return;
        }

        System.out.println(arr[index]);

        printElement(arr, index - 1);

    }

    static int sumOfArray(int[] arr, int index) {
        if (index < 0) {
            return 1;
        }

        int sum = arr[index] + sumOfArray(arr, index - 1);

        return sum;
    }

}
