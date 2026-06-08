package recursion;

public class PrintNumbers {

    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }

    static void printNum(int n) {
        System.out.println("Each time => " + n);
        if (n == 0) {
            System.out.println("Condition match");
            return;
        }
        System.out.println("Before recall => " + n);
        printNum(n - 1);
        System.out.println("After recall => " + n);
    }
}
