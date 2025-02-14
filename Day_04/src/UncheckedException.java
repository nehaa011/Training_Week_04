//Problem Statement:
//Write a Java program that asks the user to enter two numbers and divides them.
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // User input for two numbers
            System.out.print("Enter numerator: ");
            int num = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int den = scanner.nextInt();

            // Perform division
            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
    }
}
