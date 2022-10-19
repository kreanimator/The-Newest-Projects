import java.util.ArrayList;
import java.util.Arrays;

public class Battleship {
public class Ship {
    int decksCount =0;
    int [] location;
    int firstDeckLocation;

    Ship (int decks) {
        this.decksCount = decks;
        location = new int [this.decksCount];
        setLocation();
    }
    private void setLocation () {
        switch (decksCount) {
            case 1:
                firstDeckLocation = ((int) (Math.random() * 6)) - this.decksCount;
                if (firstDeckLocation < 0) {
                    firstDeckLocation = 0;
                }
                break;
            case 2:
                firstDeckLocation = (((int) (Math.random() * 4) + 5) - this.decksCount);
                if (firstDeckLocation < 5) {
                    firstDeckLocation = 5;
                }
                break;
            case 3:
                firstDeckLocation = (((int) (Math.random() * 3) + 8)) - this.decksCount;
                if (firstDeckLocation > 8) {
                    firstDeckLocation = 8;
                }
                break;
        }

        for (int i = 0; i < this.decksCount; i++) {
            location[i] = firstDeckLocation;
            firstDeckLocation++;
        }
    }
    public int[] getLocation () {
        return location;
    }

}
    public class Field {
        Ship ship4 = new Ship(4);
        Ship ship3 = new Ship(3);
        Ship ship2 = new Ship(2);
        Ship ship1 = new Ship(1);
        static char[] field = new char[10];

        Field() {
            init();
        }

        private void init() {
            Arrays.fill(field, '0');
        }

        void state4Ship(Ship ship4) {
            for (int place : ship4.getLocation()) {
                field[place] = '1';
            }
        }

        void state3Ship(Ship ship3) {
            for (int place : ship3.getLocation()) {
                field[place] = '1';
            }
        }

        void state2Ship(Ship ship2) {
            for (int place : ship2.getLocation()) {
                field[place] = '1';
            }
        }

        void state1Ship(Ship ship1) {
            for (int place : ship1.getLocation()) {
                field[place] = '1';
            }

        }

        void drawField() {
            for (char f : field) {
                if (f == '1') {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(" " + f + " ");
                }
            }
            System.out.println();
            for (int i = 1; i < 11; i++) {
                System.out.print(" " + i + " ");
            }
            System.out.println();
        }

        public static char getCellValue(int cellLoation) {
            return field[cellLoation];
        }
    }
        public void main(String[] args) {
            ArrayList ships = new ArrayList<Ship>();
            Field field = new Field();
            field.drawField();

            for (int i = 1; i < 4; i++) {
                ships.add(new Ship(i));
                field.state1Ship((Ship) ships.get(i - 1));
            }
            for (int i = 1; i < 4; i++) {
                ships.add(new Ship(i));
                field.state2Ship((Ship) ships.get(i - 1));
            }
            for (int i = 1; i < 4; i++) {
                ships.add(new Ship(i));
                field.state3Ship((Ship) ships.get(i - 1));
            }
            for (int i = 1; i < 4; i++) {
                ships.add(new Ship(i));
                field.state4Ship((Ship) ships.get(i - 1));
            }

        }
    }

