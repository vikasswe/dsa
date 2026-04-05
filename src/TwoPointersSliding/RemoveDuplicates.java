package TwoPointersSliding;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7};

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println("Total unique -> " + (j + 1));
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
