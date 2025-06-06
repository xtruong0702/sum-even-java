public class SumEven {
    public static int sumEvenUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of even numbers up to " + n + " is " + sumEvenUpTo(n));
    }
}
