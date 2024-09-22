package implement;

public class RestImpl implements interfaces.RestInterface {
    @Override
    public int Rest(int num1, int num2) {
        return num1 - num2;
    }
}
