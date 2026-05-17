public class HighestOccuring {
public static int mostOcurringcount(int[] number){
int finalCount = 0;
int count = 0;
int index = 0;
for  (;index < number.length; index++) {
count = 0;
for (int indices = 0; indices< number.length;indices++) {
if (number[index] == number[indices]) {
count++;
}
}

if (count > finalCount) {
finalCount = count;
}
}

return finalCount;
}


public static void main(String [] args) {
int [] numbers = {1,2,2,2,3};
int [] number = {1,5,5,6,4,5,5,6};
System.out.println(mostOcurringcount(numbers));
System.out.println(mostOcurringcount(number));
}
}
