import java.io.IOException;

import utils.ReaderUtil;
import utils.SelectOperation;


public class TransactionManager {
    public static void main(String[] args) throws Exception {
        ReaderUtil readerUtil = new ReaderUtil();
        SelectOperation selectOperation = new SelectOperation();
        double[] numbers = new double[2];

        try {
            numbers = readerUtil.readNumbers(
                    "C:\\Users\\Acer\\OneDrive - INSTITUTO TECNOLOGICO METROPOLITANO - ITM\\Escritorio\\Java\\Calculator\\documents\\numbers.txt");
            System.out.println("Numbers read in file: " + (String.format("First Number: %.0f", numbers[0])) + " and " +
                    (String.format("Second Number: %.0f", numbers[1])));
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        selectOperation.selectOperation(numbers);
    }
}