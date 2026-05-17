import java.util.Arrays;
public class HighestOcurring{
public static int highestOcurring(int [] number){
int highestOccur = number [0];

int target = 0;
int count = 0;
int maxCount = 0;
int indextwo = 0;

int index = 1;
for (;index < number.length; index++){
for (; indextwo < number.length; indextwo++) {
if (number[index] == number[indextwo]) {
count++;
}

}
if (count > maxCount) {
maxCount = count;
highestOccur = number[index];
}
}
return highestOccur;
}


public static void main(String[] args){
int [] number = {3,4,3,4,1,5};
int [] numberTwo = {2,1,2,5,2,4};
System.out.println(Arrays.toString(highestOcurring(number)));
System.out.println(highestOcurring(numberTwo));
}
}
