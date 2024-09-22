package implement;

import domain.Operation;

public class Sum extends Operation {
    @Override
    public int operate(int num1, int num2) {
        return num1 + num2;
    }
}