import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {
        // two numbers, 0 + 1 = 1

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int num1 = 0;

        int num2 = 1;

        int result = num1 + num2;

        int i;

        for (i = num; i >= 0; i--) {
            num1 = num2;

            result = num1 + num2;

            System.out.println(result);

            num2 = result;

            System.out.println(result);

        }
    }
}