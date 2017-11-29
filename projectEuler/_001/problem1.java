package projectEuler._001;
public class problem1 {
    public static void main(String[] args) {

        sum();
    }

    private static void sum() {

        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

