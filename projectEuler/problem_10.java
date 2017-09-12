package projectEuler;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class problem_10 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int cap = 2000000;
        long sumOfPrimes = 0;
        for (int i = 2; i <= cap; i++) {
            if (isPrime(i)) {
                sumOfPrimes += i;
            }
        }
        System.out.println("Sum is: " + sumOfPrimes);
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }
    private static boolean isPrime(int num) {

        if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
