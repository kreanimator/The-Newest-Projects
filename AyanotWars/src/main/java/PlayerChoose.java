import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class PlayerChoose implements ActionListener {
    JFrame chooseWindow;
    JButton warrior, warlock, mage;
    JLabel logo;
    JLabel iconWar, iconMag, iconWarl;

    Font myFont = new Font("TimesRoman", Font.BOLD, 30);

    public PlayerChoose() {

        chooseWindow = new JFrame("Ayanot Wars");
        chooseWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseWindow.setSize(700, 550);
        chooseWindow.setResizable(false);
        chooseWindow.setLocationRelativeTo(null);
        chooseWindow.setLayout(null);

        logo = new JLabel();
        logo.setBounds(150, 10, 400, 100);
        logo.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("logo.png"))));

        warrior = new JButton("Warrior");
        warrior.setFont(myFont);
        warrior.setBounds(325, 115, 200, 60);
        warrior.addActionListener(this);

        warlock = new JButton("Warlock");
        warlock.setFont(myFont);
        warlock.setBounds(325, 195, 200, 60);
        warlock.addActionListener(this);

        mage = new JButton("Mage");
        mage.setFont(myFont);
        mage.setBounds(325, 275, 200, 60);
        mage.addActionListener(this);

        iconWar = new JLabel();
        iconWar.setBounds(250, 115, 60, 60);
        iconWar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("warrior.png"))));
        iconWar.setHorizontalAlignment(SwingConstants.LEFT);
        iconWar.setVisible(true);

        iconWarl = new JLabel();
        iconWarl.setBounds(250, 195, 60, 60);
        iconWarl.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("warlock.png"))));
        iconWarl.setHorizontalAlignment(SwingConstants.LEFT);
        iconWarl.setVisible(true);

        iconMag = new JLabel();
        iconMag.setBounds(250, 275, 60, 60);
        iconMag.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("mage.png"))));
        iconMag.setHorizontalAlignment(SwingConstants.LEFT);
        iconMag.setVisible(true);

        chooseWindow.add(logo);
        chooseWindow.add(warrior);
        chooseWindow.add(mage);
        chooseWindow.add(warlock);
        chooseWindow.add(iconWar);
        chooseWindow.add(iconWarl);
        chooseWindow.add(iconMag);
        chooseWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == warrior) {
            new Map();
        }
        if (e.getSource() == warlock) {
            new Map();
        }
        if (e.getSource() == mage) {
            new Map();

        }
    }
}

