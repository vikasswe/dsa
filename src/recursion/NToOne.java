package recursion;

public class NToOne {
    public static void main(String[] args) {
        int n = 5;
        printNumber(n);
        int sum = sumNumber(n);

        System.out.println(sum);
    }

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }

    public static int sumNumber(int n) {
        if (n == 0) {
            return 0;
        }

        int sum = n + sumNumber(n - 1);
        return sum;
    }
}


