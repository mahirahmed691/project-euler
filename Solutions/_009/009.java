package Solutions._009;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class problem9 {

    public static void main(String[] args) {

        pythagoreantTriplet();
    }
    private static void pythagoreantTriplet() {

        long start = System.currentTimeMillis(); // start timer.
        int a = 0, b = 0, c = 0;
        int s = 1000;
        boolean found = false;
        for (a = 1; a < s / 3; a++) {
            for (b = a; b < s / 2; b++) {
                c = s - a - b;
                if (a * a + b * b == c * c) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        System.out.println("Product = " + a * b * c);
        // work out time taken for output.
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }
}
