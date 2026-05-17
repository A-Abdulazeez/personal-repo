import java.util.Scanner;

public class EvenNumbersArray{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int[] array = new int[10];
for (int count = 0; count < 10; count++) {
System.out.println("Enter a number");
int userInput = input.nextInt();
array[count] = userInput;
}

System.out.print("odd numbers: ");
for (int index = 0; index < array.length; index++) {
if (array[index] % 2 == 1) {
System.out.print(array[i] + " ");
  }
}
System.out.println();
 }
}
