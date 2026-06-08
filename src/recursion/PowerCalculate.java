package recursion;

public class PowerCalculate {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int pow = calculatePower(a, b);
        System.out.println(pow);
    }

    public static int calculatePower(int a, int b) {
        if (b == 0) {
            return 1;
        }

        int power = a * calculatePower(a, b - 1);

        return power;
    }
}
