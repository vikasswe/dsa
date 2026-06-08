package recursion;

public class Palindrome {

    public static void main(String[] args) {

        String s = "hello";

        char[] arr = s.toCharArray();

        reversSting(arr, 0, arr.length - 1);

        System.out.println(arr);

        if(arr.toString() == s){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }

    }


    public static void reversSting(char[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reversSting(arr, left + 1, right - 1);
    }
}
