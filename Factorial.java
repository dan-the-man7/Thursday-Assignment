import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int result = 1;

        int i;

        for (i = num; i > 0; i--) {
            result = i * result;
        }

        System.out.println(result + " is the factorial of "+ num);
        
    }
}