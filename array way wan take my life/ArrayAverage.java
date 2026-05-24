import java.util.*;

//Write a method to find the average of an array.

public class ArrayAverage{
public static double findAverageOf(double [] numbers) {
double total = 0;
double count = 0;
double average = 0;

for(int index= 0; index < numbers.length; index++){
  total += numbers[index];
  count += 1;

  average = total/count ;
}
     return average;
}
public static void main (String[] args) {
  double [] numbers = {1,3,2,4};
System.out.println(findAverageOf(numbers));
}

}
