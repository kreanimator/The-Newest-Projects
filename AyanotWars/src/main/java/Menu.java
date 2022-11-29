import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class Menu implements ActionListener {

    JFrame window;
    JButton startButton;
    JLabel logo;

    Font myFont = new Font("TimesRoman", Font.BOLD, 30);

    public Menu() {

        window = new JFrame("Ayanot Wars");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(700, 550);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setBackground(Color.WHITE);

        logo = new JLabel();
        logo.setBounds(150, 10, 400, 100);
        logo.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("logo.png"))));


        startButton = new JButton("Start");
        startButton.setFont(myFont);
        startButton.setBounds(275, 225, 150, 60);
        startButton.addActionListener(this);


        window.add(logo);
        window.add(startButton);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
                new PlayerChoose();

        }
    }
}

