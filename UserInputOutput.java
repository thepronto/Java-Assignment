import java.util.Scanner;

public class UserInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculation
        double sum = num1 + num2;
        double average = sum / 2;

        // Output
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + average);

        scanner.close();
    }
}
