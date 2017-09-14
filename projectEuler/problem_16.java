package projectEuler;
import java.math.BigInteger;

public class problem_16 {

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        powerDigitSum(1000);
        long end = System.currentTimeMillis();
        System.out.println("Execution time: "+ (end - begin) + "ms");
    }
    private static void powerDigitSum(int power) {

        int sum = 0;
        BigInteger n = BigInteger.valueOf(2);
        n = n.pow(power);
        String s = n.toString();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            String x = c.toString();
            int j = Integer.parseInt(x);
            sum += j;
        }
        System.out.println(sum);
    }
}