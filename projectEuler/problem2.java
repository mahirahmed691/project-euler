package projectEuler;
public class problem2 {

    // Even Fibonacci numbers
    public static void main(String[] args) {

        new problem2().EvenFibonacciNumbers();
    }
    private void EvenFibonacciNumbers() {

        int term1 = 1;
        int term2 = 2;
        int i;
        int result = 2;
        while (term1 < 4000000) {
            i = term1;
            term1 = term2;
            term2 = term2 + i;
            if (term2 % 2 == 0) {
                result += term2;
            }
        }
        System.out.println(result);
    }
}
