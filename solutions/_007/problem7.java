package solutions._007;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class problem7 {
    //Smallest prime number
    //checks whether an int is prime or not.
    private static boolean isPrime(int num) {

        if (num > 2 && num % 2 == 0) {
            System.out.println(num + " is not prime");
            return false;
        }
        int top = (int) Math.sqrt(num) + 1;
        for (int i = 3; i < top; i += 2) {
            if (num % i == 0) {
                System.out.println(num + " is not prime");
                return false;
            }
        }
        System.out.println(num + " is prime");
        return true;
    }
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int amountOfPrimes = 0;
        int number = 2;
        while (amountOfPrimes != 10001) {
            if (isPrime(number)) {
                amountOfPrimes++;
                System.out.println(number + " is prime");
            }
            number++;
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }
}
