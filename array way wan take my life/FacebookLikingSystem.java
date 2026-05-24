public class FacebookLikingSystem{
public static String likingSystem(String [] people){

String result = "no one likes this";
if (people.length == 0){
return result;
}
else if ( people.length == 1){
return String.format("%s likes  this", people[0]) ;
}
else if ( people.length == 2){
return String.format("%s, %s  likes this", people[0], people[1] );
}
else if ( people.length == 3){
return String.format("%s, %s, %s likes this", people[0],people[1],people[2]);
}
else{
int remaining = people.length - 2;
return String.format("%s, %s ,and %d others likes this", people[0],people[1],remaining);
}

}


public static void main(String [] args){
String [] people = {"kayode","bola","kay","jay","tolu","kab"};
System.out.println(likingSystem(people));
}
}
