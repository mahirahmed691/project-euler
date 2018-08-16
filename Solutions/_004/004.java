package Solutions._004;
public class problem4 {

    // Find the greatest palindrome.
    public static void main(String[] args) {

        int product;
        int current;
        int greatestCurrent = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                product = i * j;
                if (isPalindrome(Integer.toString(product))) {
                    current = product;
                    if (current > greatestCurrent) {
                        greatestCurrent = current;
                    }
                }
            }
        }
        System.out.println("Greatest palindrome is: " + greatestCurrent);
    }
    private static boolean isPalindrome(String s) {

        StringBuilder string = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            string.append(s.charAt(i - 1));
        }
        return s.equals(string.toString());
    }
}
