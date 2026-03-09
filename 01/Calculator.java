import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Arithmetic operations
        double addRes = num1 + num2;
        double subRes = num1 - num2;
        double mulRes = num1 * num2;
        double divRes = num1 / num2;

        // Display results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + num1 + " and " + num2 + " is "
                + addRes + ", " + subRes + ", "
                + mulRes + ", and " + divRes);

        sc.close(); // close scanner
    }
}