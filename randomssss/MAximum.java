public class MAximum{
public static int maxNumberis(int [] number){
int maximun = number [0];

int index = 1;
for (;index < number.length; index++){
if (number[index] > maximun){
maximun = number[index] ;
}
}
return maximun;
}

public static void main(String[] args){

int [] numbers = {5,12,3,7,71,3};
System.out.println(maxNumberis(numbers));
System.out.println(minNUmberis(numbers));
}

public static int minNUmberis(int [] number){
int minimum = number [0];

int index = 1;
for (;index < number.length; index++){
if (number[index] < minimum){
minimum = number[index] ;
}
}
return minimum;
}
}
