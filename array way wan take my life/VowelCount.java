public class VowelCount {

    public static int vowelCountOf(String word) {
        int result = 0;

        for (int index = 0; index < word.length(); index++) {
            char character = Character.toLowerCase(word.charAt(index));

            if (character == 'a' || character == 'e' || character == 'i' || 
                character == 'o' || character == 'u') {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(vowelCountOf("boyay"));
    }
}
