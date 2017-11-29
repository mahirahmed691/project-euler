package projectEuler.Problem_6;
public class problem6 {

    public static void main(String[] args) {

        int squares = 0;
        int sums = 0;
        int finalSums = 0;
        for (int i = 1; i <= 100; i++) {
            squares += Math.pow(i, 2);
        }
        for (int i = 1; i <= 100; i++) {
            sums += i;
        }
        finalSums += Math.pow(sums, 2);
        System.out.println(finalSums - squares);
    }
}

