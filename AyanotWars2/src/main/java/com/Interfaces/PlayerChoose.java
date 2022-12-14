package com.Interfaces;

import com.CreateMap;
import com.Units.Player;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class PlayerChoose extends JPanel implements ActionListener {
    JDialog chooseWindow;

    JButton warrior, warlock, mage;
    JLabel logo;
    JLabel iconWar, iconMag, iconWarl;
    static JTextField name;


    Font myFont = new Font(Font.SERIF, Font.BOLD, 30);


    public PlayerChoose() {

        chooseWindow = new JDialog();
        chooseWindow.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        chooseWindow.setSize(1024, 576);
        chooseWindow.setResizable(false);
        chooseWindow.setLocationRelativeTo(null);
        chooseWindow.setLayout(null);
        chooseWindow.setTitle("Ayanot Wars");

        JLabel nameEnter = new JLabel();
        nameEnter.setText("Name: ");
        nameEnter.setFont(myFont);
        nameEnter.setVisible(true);
        nameEnter.setBounds(550, 100, 300, 60);


        name = new JTextField();
        name.setBounds(550, 150, 200, 60);
        name.setVisible(true);
        name.setFont(myFont);
        name.addActionListener(this);
        name.setBackground(new Color(255,212,133));


        logo = new JLabel();
        logo.setBounds(0, 0, 1024, 576);
        logo.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icons/background.gif"))));

        warrior = new JButton("Warrior");
        warrior.setFont(myFont);
        warrior.setBounds(550, 225, 200, 60);
        warrior.addActionListener(this);
        warrior.setFocusable(false);
        warrior.setBackground(new Color(255,212,133));

        warlock = new JButton("Warlock");
        warlock.setFont(myFont);
        warlock.setBounds(550, 300, 200, 60);
        warlock.addActionListener(this);
        warlock.setFocusable(false);
        warlock.setBackground(new Color(255,212,133));

        mage = new JButton("Mage");
        mage.setFont(myFont);
        mage.setBounds(550, 375, 200, 60);
        mage.addActionListener(this);
        mage.setFocusable(false);
        mage.setBackground(new Color(255,212,133));

        iconWar = new JLabel();
        iconWar.setBounds(485, 225, 60, 60);
        iconWar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icons/warrior.png"))));
        iconWar.setHorizontalAlignment(SwingConstants.LEFT);
        iconWar.setVisible(true);

        iconWarl = new JLabel();
        iconWarl.setBounds(485, 300, 60, 60);
        iconWarl.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icons/warlock.png"))));
        iconWarl.setHorizontalAlignment(SwingConstants.LEFT);
        iconWarl.setVisible(true);

        iconMag = new JLabel();
        iconMag.setBounds(485, 375, 60, 60);
        iconMag.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/icons/mage.png"))));
        iconMag.setHorizontalAlignment(SwingConstants.LEFT);
        iconMag.setVisible(true);



        chooseWindow.add(warrior);
        chooseWindow.add(mage);
        chooseWindow.add(warlock);
        chooseWindow.add(iconWar);
        chooseWindow.add(iconWarl);
        chooseWindow.add(iconMag);
        chooseWindow.add(name);

        chooseWindow.add(nameEnter);
        chooseWindow.add(logo);
        chooseWindow.setVisible(true);


    }


    JFrame window = new JFrame();

    public void initWindow() {
        window.setSize(900, 700);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        //window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setResizable(false);


        window.getMaximizedBounds();

        window.setTitle("Ayanot wars");
        window.toFront();

//       window.add(Inventory.addButton());
         //TODO: Fix the inventory button, cause it's ruins game.

    }

    public static String setPlayerName() {
        String playerName = name.getText();
        name.selectAll();
        return playerName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == warrior) {
            Player.setPlayerClass("warrior");
            CreateMap createMap = new CreateMap();
            window.add(createMap);
            window.addKeyListener(createMap);
            SwingUtilities.invokeLater(this::initWindow);

            chooseWindow.dispose();
        }
        if (e.getSource() == warlock) {

            Player.setPlayerClass("warlock");
            CreateMap createMap = new CreateMap();
            window.add(createMap);
            window.addKeyListener(createMap);
            SwingUtilities.invokeLater(this::initWindow);
           chooseWindow.dispose();
        }
        if (e.getSource() == mage) {

            Player.setPlayerClass("mage");
            CreateMap createMap = new CreateMap();
            window.add(createMap);
            window.addKeyListener(createMap);
            SwingUtilities.invokeLater(this::initWindow);
           chooseWindow.dispose();
        }
    }
}

