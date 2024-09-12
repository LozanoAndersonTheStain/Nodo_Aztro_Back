// Package
package domain;

// Imports
import implement.Operations;
import model.OperationsInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Class Operation
public class Operation extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;
    private OperationExecutor operationExecutor;

    public Operation() {
        OperationsInterface operations = new Operations();
        operationExecutor = new OperationExecutor(operations);

        setTitle("Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setLayout(new GridLayout(5, 2));

        JLabel num1Label = new JLabel("Number 1: ");
        num1Label.setForeground(Color.WHITE);
        num1Field = new JTextField();
        num1Field.setBackground(Color.BLACK);
        num1Field.setForeground(Color.WHITE);
        num1Field.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        num1Field.setCaretColor(Color.WHITE);

        JLabel num2Label = new JLabel("Number 2: ");
        num2Label.setForeground(Color.WHITE);
        num2Field = new JTextField();
        num2Field.setBackground(Color.BLACK);
        num2Field.setForeground(Color.WHITE);
        num2Field.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
        num2Field.setCaretColor(Color.WHITE);

        JButton sumButton = new JButton("Sum");
        sumButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        JButton restButton = new JButton("Rest");
        restButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        JButton multiplicationButton = new JButton("Multiplication");
        multiplicationButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        JButton divideButton = new JButton("Divide");
        divideButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        resultLabel = new JLabel("Result: ");
        resultLabel.setForeground(Color.WHITE);

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("Sum");
            }
        });

        restButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("Rest");
            }
        });

        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("Multiplication");
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation("Divide");
            }
        });

        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(sumButton);
        add(restButton);
        add(multiplicationButton);
        add(divideButton);
        add(resultLabel);
    }

    private void performOperation(String operation) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            String result = operationExecutor.executeOperation(operation, num1, num2);
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid number");
        }
    }
}