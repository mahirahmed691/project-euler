package projectEuler.Problem_13;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class problem_13 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis(); // start timer.
        BigInteger sum = BigInteger.ZERO;
        File file = new File("largeSum.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                BigInteger bi = new BigInteger(line);
                sum = sum.add(bi);
            }
            System.out.println("The answer is: " + sum.toString().substring(1, 10));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }
}
