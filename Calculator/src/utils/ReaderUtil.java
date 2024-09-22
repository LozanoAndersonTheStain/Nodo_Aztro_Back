package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderUtil {
    public double[] readNumbers(String fileName) throws IOException, NumberFormatException {
        double[] numbers = new double[2];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line1 = reader.readLine();
            String line2 = reader.readLine();

            numbers[0] = Double.parseDouble(line1);
            numbers[1] = Double.parseDouble(line2);
        }

        return numbers;
    }
}
