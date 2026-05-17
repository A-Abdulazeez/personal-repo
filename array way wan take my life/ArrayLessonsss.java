import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLessonsss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            numbers.add(num);
        }

        System.out.println(numbers);
    }
}
