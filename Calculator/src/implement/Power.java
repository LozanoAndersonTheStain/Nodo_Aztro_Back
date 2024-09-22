package implement;

import domain.Operation;

public class Power extends Operation {
    @Override
    public int operate(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
}