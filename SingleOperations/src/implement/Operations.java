package implement;

import model.OperationsInterface;

public class Operations implements OperationsInterface {
    @Override
    public int Sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int Rest(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        return num1 / num2;
    }
}