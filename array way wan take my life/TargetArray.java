import java.util.*;

//Create a method to search for an element in an array.

public class TargetArray{
public static boolean targetNumber(int[] numbers, int mainTarget) {
  boolean finalNum = false;
   for (int index =0; index < numbers.length; index++){
if(numbers[index] == mainTarget){
finalNum = true;
}
   }
    return finalNum;
}
  


public static void main (String[] args) {
  int [] numbers =  {3,2,1};

System.out.println(targetNumber(numbers, 4));
}

}
