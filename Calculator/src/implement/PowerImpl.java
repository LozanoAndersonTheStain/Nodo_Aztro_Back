package implement;

public class PowerImpl implements interfaces.PowerInterface {
    @Override
    public int Power(int num1, int num2) {
        return num1^num2;
    }
}