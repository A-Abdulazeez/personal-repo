public class FindDuplicates{
public static void main(String... bexo){


String sentence = "kazeem";
System.out.println("How many duplicates are in the word: " + sentence);
String characters = "";
String duplicate = "";
for (int index = 0; index < sentence.length(); index++){
String current = Character.toString(sentence.charAt(index));
if (characters.contains(current)){
if (!duplicate.contains(current)){
duplicate += current;
}
}

characters += current;
}
System.out.println(duplicate + ",");
}





}
