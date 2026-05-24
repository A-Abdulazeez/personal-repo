import java.util.*;

//Write a method to validate an email format.

public class EmailFormat{
  public static String emailFormat (String emailAdress){
    String statement = "";
    if(emailAdress.length() < 5) {
      statement = "email adresss must be longer than 5 Character";
    }
    else if(!emailAdress.contains("@")) {
      statement = "email adresss must contain @";
    }
    else if(!emailAdress.contains(".com")) {
      statement = "email adresss must end with .com";
    }
   else if(emailAdress.startsWith("@")) {
      statement = "email adresss cannot start with @";
    }
   else if(emailAdress.endsWith("@")) {
      statement = "email adresss cannot end with @";
    }
    else {
      statement = "okay";
    }
    return statement;
   
  }


public static void main (String[] args) {
  String mail =  "@adebex@gmail.com";
System.out.println(emailFormat(mail));
}

}
