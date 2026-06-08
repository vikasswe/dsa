package recursion;

public class ReverseString {

    public static void main(String[] args) {
        String s = "hello";

        String rev = reverseString(s, s.length() - 1);
        int left = 0;
        int right = s.length() - 1;

        char [] arr = s.toCharArray();
        reverseUsingTwoPointers(arr, left, right);

//        System.out.println(rev);

        System.out.println(arr);
    }

    public static String reverseString(String str, int index) {

        if (index < 0) {
            return "";
        }

        String st = str.charAt(index) + reverseString(str, index - 1);

        return st;
    }

    public static void reverseUsingTwoPointers(char [] arr, int left, int right) {

        if(left >= right){
            return;
        }

        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseUsingTwoPointers(arr, left +1, right-1);

    }

}
