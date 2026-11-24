import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1=s.nextInt();

        System.out.println("Enter the second number:");
        int num2=s.nextInt();

        System.out.println("Enter an operator (+,-,*,/): ");
        char operator = s.next().charAt(0);

        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}