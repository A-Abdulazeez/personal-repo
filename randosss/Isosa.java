public class Isosa{
public static void main(String[]args){ 

int userInput = 5;

for (int mainLoop = 1; mainLoop <= userInput; mainLoop++){
	//System.out.println("*");
	
for (int innerLoop = userInput; innerLoop > mainLoop; innerLoop--){
	System.out.print(" ");
}

for (int outerLoop = 1; outerLoop <= mainLoop; outerLoop++){
	System.out.print("*");
}

System.out.println();

}
}
}
