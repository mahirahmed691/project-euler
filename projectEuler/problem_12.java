package projectEuler;
public class problem_12 {

    public static void main(String[] args) {

        int triNum, divisorLimit, count;
        triNum = divisorLimit = count = 0;
        while (divisorLimit <= 500) {
            divisorLimit = 0;
            count++;
            triNum += count;
            for (int counter = 1; counter <= Math.sqrt(triNum); counter++) {

                if (triNum % counter == 0) {
                    divisorLimit += 2;
                }
            }
            if (Math.sqrt(triNum) * Math.sqrt(triNum) == triNum) {
                divisorLimit--;
            }
        }
        System.out.println(triNum);
    }
}
