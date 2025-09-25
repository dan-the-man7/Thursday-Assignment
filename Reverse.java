import java.util.Scanner;

public class Reverse {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number as a string [Enter] ");
        String num = input.nextLine();

        String r = "";

        int i;

        for (i = num.length()-1; i >= 0; i--) {
            r = r + num.charAt(i);
        }

        System.out.println(r);

    }
}