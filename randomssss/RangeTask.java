public class RangeTask{

public static int RangeOf(int [] numbers){
int largest = numbers[0];
int smallest = numbers[0];

int index = 1 ;
for(; index < numbers.length;index++){

if (numbers[index] > largest) {
largest = numbers[index];
}
if (numbers[index] < smallest) {
smallest = numbers[index];
}
}

int range = largest - smallest;
return range;
}

public static void main(String[]args){
int [] numbers = {2,3,7,9,20};
System.out.println(RangeOf(numbers));

}
}


