// Package
package domain;

import model.OperationsInterface;
import java.text.DecimalFormat;

public class OperationExecutor {
    private OperationsInterface operations;
    private DecimalFormat decimalFormat;

    public OperationExecutor(OperationsInterface operations) {
        this.operations = operations;
        this.decimalFormat = new DecimalFormat("#.##");
    }

    public String executeOperation(String operation, int num1, int num2) {
        try {
            switch (operation) {
                case "Sum":
                    return String.valueOf(operations.Sum(num1, num2));
                case "Rest":
                    return String.valueOf(operations.Rest(num1, num2));
                case "Multiplication":
                    return String.valueOf(operations.multiplication(num1, num2));
                case "Divide":
                    double result = operations.divide(num1, num2);
                    return decimalFormat.format(result);
                default:
                    return "Invalid Operation";
            }
        } catch (ArithmeticException e) {
            return "Error: " + e.getMessage();
        }
    }
}