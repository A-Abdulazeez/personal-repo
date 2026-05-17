import java.util.*;

public class NumberToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];
	int sumOfArray = 0;
	int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
            sumOfArray += numbers[i];
            if (numbers[i] > largest){
            largest = numbers[i];
            }
        }

        System.out.println(Arrays.toString(numbers));
 	 System.out.println("The sum of the array collected is: " + sumOfArray); 
 	  System.out.println("The largest of the array collected is: " + largest); 
    }
}
