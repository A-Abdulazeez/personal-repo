import java.util.*;

public class ReturnArray {

    public static int[] collectNumbers() {

        Scanner sc = new Scanner(System.in);

        int[] temp = new int[100]; // temporary storage
        int count = 0;

        while (true) {
           System.out.print("Enter a number (-1 to stop): ");
           int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            temp[count] = num;
            count++;
        }

        // create final array with exact size
        int[] numbers = Arrays.copyOf(temp, count);

        return numbers;
    }

    public static void main(String[] args) {

        int[] result = collectNumbers();

        System.out.println(Arrays.toString(result));
    }
}
