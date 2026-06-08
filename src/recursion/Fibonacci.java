package recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 6;
        int data = fibonacciOfNumber(n);
        System.out.println(data);
    }

    public static int fibonacciOfNumber(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int data = fibonacciOfNumber(n - 1) + fibonacciOfNumber(n - 2);

        return data;
    }

}
