package projectEuler._005;
public class problem5 {


    // Smallest multiple
    public static void main (String[] args){

        int smallest = 0;

        for(int num = 2; num < 1000000000; num += 2) {
            boolean isMultiple = true;

            for (int multiple = 1; multiple <= 20; multiple++) {

                if (num % multiple != 0) {
                    isMultiple = false;
                }
            }

            if (isMultiple) {
                smallest = num;
                break;
            }
        }

        System.out.println(smallest);

    }

}