import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
public class Calculator implements ActionListener {

    JFrame frame;
    JTextField field;
    JTextField memory;

    JButton[] numberButtons;
    JButton[] functionButtons;
    JButton addButton, subButton, mulButton, divButton, equButton, delButton, clrButton, negButton, decButton;

    JPanel panel;


    Font myFont = new Font("TimesRoman", Font.BOLD, 30);
    static double num1 = 0, num2 = 0, result = 0;
    static char operator;


    public Calculator() {
        frame = new JFrame("My calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 550);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setLayout(null);

        field = new JTextField(16);
        field.setBounds(50, 25, 300, 50);
        field.setFont(myFont);
        field.setEditable(false);
        field.setBackground(Color.LIGHT_GRAY);

        memory = new JTextField();
        memory.setBounds(400, 100, 260, 300);
        memory.setEditable(false);
        memory.setFont(myFont);
        memory.setBackground(Color.LIGHT_GRAY);
        memory.setHorizontalAlignment(JTextField.LEFT);


        numberButtons = new JButton[10];
        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(Color.LIGHT_GRAY);


        }

        functionButtons = new JButton[9];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("\u00D7");
        divButton = new JButton("\u00F7");
        equButton = new JButton("=");
        delButton = new JButton("\u232B");
        clrButton = new JButton("Clear");
        negButton = new JButton("\u00B1");
        decButton = new JButton(".");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equButton;
        functionButtons[5] = delButton;
        functionButtons[6] = clrButton;
        functionButtons[7] = negButton;
        functionButtons[8] = decButton;


        for (JButton functionButton : functionButtons) {
            functionButton.setFont(myFont);
            functionButton.setFocusable(false);
            functionButton.setBackground(Color.LIGHT_GRAY);
            functionButton.addActionListener(this);
        }

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.DARK_GRAY);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        negButton.setBounds(50, 430, 65, 50);
        delButton.setBounds(125, 430, 80, 50);
        clrButton.setBounds(215, 430, 135, 50);

        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(memory);
        frame.add(panel);
        frame.add(field);
        frame.setVisible(true);

        JLabel fon = new JLabel();
        fon.setBounds(0, 0, 700, 550);
        fon.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("fon.jpg"))));
        fon.setHorizontalAlignment(SwingConstants.LEFT);

        frame.add(fon);

    }


    public static void main(String[] args) {
        new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {

                field.setText(field.getText() + i);
            }
        }

        if (e.getSource() == negButton) {
            if (field.getText().length() != 0 && field.getText().charAt(0) == '-') {
                field.setText(field.getText().substring(1));
            } else {
                field.setText("-" + field.getText());
            }
        }

        if (e.getSource() == decButton && field.getText().length() != 0 && !field.getText().contains(".")) {
            field.setText(field.getText() + ".");
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(field.getText());
            operator = '+';
            field.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(field.getText());
            operator = '-';
            field.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(field.getText());
            operator = '*';
            field.setText("");

        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(field.getText());
            operator = '/';
            field.setText("");

        }

        if (e.getSource() == clrButton) {
            field.setText("");
        }

        if (e.getSource() == delButton && field.getText().length() != 0) {
            field.setText(field.getText().substring(0, field.getText().length() - 1));
        }

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(field.getText());
            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> result = num1 / num2;
            }
            field.setText(String.valueOf(result));
            num1 = result;
        }
    }
}
