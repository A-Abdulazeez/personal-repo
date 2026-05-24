public class ArrayFreeStyle{
public static int returnMax(int [] numbers){

int maximum = numbers[0];

for (int index = 1; index < numbers.length; index++){
if (numbers[index] > maximum){
maximum = numbers[index];
}
}
return maximum;
}

public static int returnMin(int [] numbers){
int minimum = numbers[0];
for (int index = 1; index < numbers.length; index++){
if (numbers[index] < minimum){
minimum = numbers[index];
}
}
return minimum;
}


public static String returnMinAndMax(int [] numbers){
int maximum = returnMax(numbers);
int minimun = returnMin(numbers);

return String.format("%d , %d ", minimun , maximum);
}

public static void main(String... argss){
int [] arrayyyy = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
System.out.println("The minimum and maximum  is " + returnMinAndMax(arrayyyy));
//System.out.println(returnMin(arrayyyy));
//System.out.println(returnMax(arrayyyy));
}
}
