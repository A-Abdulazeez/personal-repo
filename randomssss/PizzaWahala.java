public class PizzaWahala {
public static String pizzaAramide(int numberOfPeople, String pizzaType ) {
//System.out.print("""
              // Pizza Type
            //1.  SAPA SIZE
            //2.  SMALL MONEY
            //3.  BIG BOYS
            //4.  ODOGWU
            //""");

int slicesPerBox = 0;
int pricePerBox = 0;

switch (pizzaType) {
case "SAPA SIZE" :
slicesPerBox = 4;
pricePerBox = 2500;
 break;

case "SMALL MONEY":
slicesPerBox = 6;
pricePerBox = 2900;
 break;

case "BIG BOYS":
slicesPerBox = 8;
pricePerBox = 4000;
 break;

case "ODOGWU":
slicesPerBox = 12;
pricePerBox = 5200;
break;

default:
System.out.println("Invalid pizza type");
 //return;
 }

int numberOfBoxes = numberOfPeople / slicesPerBox;

if (numberOfPeople % slicesPerBox != 0) {
numberOfBoxes++;
}

int totalSlices = numberOfBoxes * slicesPerBox;
int leftOverSlices = totalSlices - numberOfPeople;
int totalPrice = numberOfBoxes * pricePerBox;

String finalSay = ("Number of boxes of pizza to buy = " + numberOfBoxes + " boxes" + "Number left over slices after serving = " + leftOverSlices + " slices" + "Price = " + totalPrice);
return finalSay;
}
public static void main(String... args){
System.out.println(pizzaAramide(4,"SAPA SIZE"));

}
}
