import java.util.Scanner;

public class Vowelcount {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        int vowel_count = 0;

        int i;

        for (i = word.length()-1; i >= 0; i--) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                vowel_count++;
            }
        }

        System.out.println("Vowel count: " + vowel_count);

    }
}