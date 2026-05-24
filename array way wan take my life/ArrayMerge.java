import java.util.*;

//Create a method to merge two arrays.

public class ArrayMerge {

    public static int [] mergedArray(int[] firstSet, int [] secondSet) {
      int newArrayLength = firstSet.length + secondSet.length;
      int [] newSet = new int[newArrayLength];
for (int index = 0; index < firstSet.length; index++){
     newSet[index] = firstSet[index];
}
for (int index = 0; index < secondSet.length; index++){
      newSet[firstSet.length + index] = secondSet[index];
}
      return newSet;
    }

     

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 4};

        System.out.println(Arrays.toString(mergedArray(numbers,numbers)));
    }



}
