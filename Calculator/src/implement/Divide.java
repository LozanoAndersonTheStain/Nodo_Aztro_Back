package implement;

import domain.Operation;

public class Divide extends Operation{
    @Override
    public int operate(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}
