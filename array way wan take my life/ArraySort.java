import java.util.*;



public class ArraySort{
  public static int [] sortArray (int [] numbers){
   Arrays.sort(numbers);
   return numbers;
   
  }


public static void main (String[] args) {
  int [] numbers =  {3,2,1};
System.out.println(Arrays.toString(sortArray(numbers)));
}

}
