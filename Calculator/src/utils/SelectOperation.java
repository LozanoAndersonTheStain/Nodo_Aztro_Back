package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import domain.Operation;
import implement.Sum;
import implement.Rest;
import implement.Multiplication;
import implement.Divide;
import implement.Power;

public class SelectOperation {
    public void selectOperation(double[] numbers) {
        Scanner scanner = new Scanner(System.in);
        Operation operation = null;

        try {
            System.out.println("Select operation: ");
            System.out.println("1. Sum");
            System.out.println("2. Rest");
            System.out.println("3. Multiplication");
            System.out.println("4. Divide");
            System.out.println("5. Power");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    operation = new Sum();
                    break;
                case 2:
                    operation = new Rest();
                    break;
                case 3:
                    operation = new Multiplication();
                    break;
                case 4:
                    operation = new Divide();
                    break;
                case 5:
                    operation = new Power();
                    break;
                default:
                    System.out.println("Invalid option");
                    return;
            }

            int num1 = (int) numbers[0];
            int num2 = (int) numbers[1];

            double result = operation.operate(num1, num2);
            System.out.println(String.format("Result: %.0f", result)); 

        } catch (InputMismatchException e) {
            System.out.println("You must enter a number.");
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero.");
        } finally {
            scanner.close();
        }
    }
}