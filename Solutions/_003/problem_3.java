package Solutions._003;
import java.util.ArrayList;

public class problem_3 {
    // Largest prime factors
    private static ArrayList<Long> largestPrimeFactor(long num) {

        ArrayList<Long> factors = new ArrayList<>();
        for (long i = 2; i <= num; i++) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        return factors;
    }
    public static void main(String[] args) {

        for (Long lon : largestPrimeFactor(600851475143L)) {
            System.out.println(lon);
        }
    }
}
