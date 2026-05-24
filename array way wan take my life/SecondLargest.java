public class SecondLargest {

    public static int secondLargestOf(int[] numbers) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] > largest) {
                secondLargest = largest;
                largest = numbers[index];
            }

            else if (numbers[index] > secondLargest &&
                     numbers[index] != largest) {
                secondLargest = numbers[index];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 4};

        System.out.println(secondLargestOf(numbers));
    }
}
