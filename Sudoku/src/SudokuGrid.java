
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.Border;

final class SudokuGrid extends JPanel {


    //Creating new font
    private static final Font FONT = new Font("Verdana",
            Font.CENTER_BASELINE,
            20);
    //Creating fields for sudoku
    private final JTextField[][] grid;

    //Initializing dimensions
    private final int dimension;

    //Panels for placing everything
    private final JPanel gridPanel;
    private final JPanel buttonPanel,buttonPanel1;
    private final JButton undoButton;
    private final JButton clearButton;
    private final JButton [] numButtons;

    private final JPanel[][] minisquarePanels;

    SudokuGrid(int dimension) {
        this.grid = new JTextField[dimension][dimension];
        this.dimension = dimension;

        for (int y = 0; y < dimension; ++y) {
            for (int x = 0; x < dimension; ++x) {
                JTextField field = new JTextField();
                //keylistener
                grid[y][x] = field;
            }
        }

        this.gridPanel   = new JPanel();
        this.buttonPanel = new JPanel();
        this.buttonPanel1 = new JPanel();

        //Borders between grids
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        Dimension fieldDimension = new Dimension(35, 35);

            //Pop-up menu listener
        class PopupMenuListener implements ActionListener {

            private final JTextField field;
            private final int number;

            PopupMenuListener(JTextField field, int number) {
                this.field  = field;
                this.number = number;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("" + number);
            }
        }

        for (int y = 0; y < dimension; ++y) {
            for (int x = 0; x < dimension; ++x) {
                JTextField field = grid[y][x];
                field.setBorder(border);
                field.setFont(FONT);
                field.setHorizontalAlignment(JTextField.CENTER);
                field.setPreferredSize(fieldDimension);

                JPopupMenu menu = new JPopupMenu();

                for (int i = 0; i <= dimension; ++i) {
                    JMenuItem item = new JMenuItem("" + i);
                    menu.add(item);
                    item.addActionListener(new PopupMenuListener(field, i));
                }

                field.add(menu);
                field.setComponentPopupMenu(menu);
            }
        }
        //Creating quantity of minisquares
        int minisquareDimension = (int) Math.sqrt(dimension);
        this.gridPanel.setLayout(new GridLayout(minisquareDimension,
                minisquareDimension));

        this.minisquarePanels = new JPanel[minisquareDimension]
                [minisquareDimension];

        Border minisquareBorder = BorderFactory.createLineBorder(Color.BLACK, 1);

        for (int y = 0; y < minisquareDimension; ++y) {
            for (int x = 0; x < minisquareDimension; ++x) {
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(minisquareDimension,
                        minisquareDimension));
                panel.setBorder(minisquareBorder);
                minisquarePanels[y][x] = panel;
                gridPanel.add(panel);
            }
        }

        for (int y = 0; y < dimension; ++y) {
            for (int x = 0; x < dimension; ++x) {
                int minisquareX = x / minisquareDimension;
                int minisquareY = y / minisquareDimension;

                minisquarePanels[minisquareY][minisquareX].add(grid[y][x]);
            }
        }

        //Thick borders
        this.gridPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,
                2));
        this.clearButton = new JButton("Clear");
        this.undoButton = new JButton("Undo");
        this.buttonPanel1.setLayout(new GridLayout(1,11,1,1));
        this.buttonPanel.add(clearButton, BorderLayout.WEST);

        numButtons = new JButton[10];
        for (int i =1; i<=9; i++){
            numButtons[i] = new JButton();
            numButtons[i].setText(String.valueOf(i));
            numButtons[i].setVisible(true);
            //numButtons[i].setFont(new Font("Arial",Font.BOLD,8));
            numButtons[i].setSize(15,15);
            numButtons[i].setFocusable(false);
            this.buttonPanel1.add(numButtons[i]);

        }

        this.buttonPanel.add(undoButton, BorderLayout.EAST);

        this.setLayout(new BorderLayout());
        this.add(gridPanel,   BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(buttonPanel1);


        clearButton.addActionListener((ActionEvent e) -> {
            clearAll();
        });

        undoButton.addActionListener((ActionEvent e) -> {

        });
    }

    void clearAll() {
        for (JTextField[] row : grid) {
            for (JTextField field : row) {
                field.setText("");
            }
        }
    }


}
