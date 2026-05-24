import java.util.*;
public class FindSum{

public static int returnn(int [] arrayNumber){

int largest = arrayNumber[0];
for (int index = 1; index < arrayNumber.length; index++){
if (arrayNumber[index] < largest) largest = arrayNumber[index];
}
return largest;
}

public static void main(String... args){


int [] arrayNumber = {1,2,3,4,5,6,70,8,9};

System.out.println(returnn(arrayNumber));



}

}
