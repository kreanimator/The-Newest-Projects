import java.util.Arrays;
import java.util.Random;

public class Battleship {

    public static void battleShip() {

        final int[][] field = new int[10][10]; //Creating field
        System.out.println("Empty field");
        showField(field);
        final int deckCount4 = 1, deckCount3 = 2, deckCount2 = 3, deckCount1 = 4;

        final int shipLength4 = 4, shipLength3 = 3, shipLength2 = 2, shipLength1 = 1;

        final int[][] field4 = setShip(field, deckCount4, shipLength4);
        System.out.println("Four decks ships : ");
        showField(field4);

        final int[][] field3 = setShip(field4, deckCount3, shipLength3);
        System.out.println("Three decks ships : ");
        showField(field3);
        final int[][] field2 = setShip(field3, deckCount2, shipLength2);
        System.out.println("Two decks ships : ");
        showField(field2);
        final int[][] field1 = setShip(field2, deckCount1, shipLength1);
        System.out.println("One deck ships : ");
        showField(field1);
    }


    public static int[][] setShip(int[][] field, int deckCount, int shipLength) {
        int[][] newField = field.clone();
        for (int i = 0; i < deckCount; i++) {
            checkShip(newField, 0, searchPoint(newField), directionShip(), shipLength);
        }
        return newField;
    }

    private static int[][] checkShip(int[][] field, int count, int[] points, int direction, int shipLength) {
        int fieldLength = field.length - 1;
        int x0 = points[0];
        int y0 = points[1];
        int x1, y1;

        if (direction == 0 && count < 2) { //Fixing x on horizontal axis
            int temp = (y0 + shipLength - 1);
            x1 = x0;
            if (temp > fieldLength) {
                return checkShip(field, count + 1, points, 1, shipLength);
            } else {
                y1 = temp;
            }
            if (isNotPlaceForShip(field, x0, y0, x1, y1)) {
                return checkShip(field, count + 1, searchPoint(field), 1, shipLength);
            }
            return fillShip(field, x0, y0, x1, y1);
        } else if (direction == 1 && count < 2) { // fixing Y on horizontal axis
            int temp = (x0 + shipLength - 1);
            y1 = y0;
            if (temp > fieldLength) {
                return checkShip(field, count + 1, points, 0, shipLength);
            } else {
                x1 = temp;
            }

            if (isNotPlaceForShip(field, x0, y0, x1, y1)) {
                return checkShip(field, count + 1, searchPoint(field), 0, shipLength);
            }
            return fillShip(field, x0, y0, x1, y1);
        } else {
            return checkShip(field, 0, searchPoint(field), directionShip(), shipLength);
        }

    }

    private static int directionShip() {
        return new Random().nextInt(2);
    }

    private static boolean isNotPlaceForShip(int[][] field, int x0, int y0, int x1, int y1) {
        int check = 0;
        int fieldLength = field.length - 1;

        int fieldX0 = (x0 - 1 < 0) ? x0 : x0 - 1;
        int fieldY0 = (y0 - 1 < 0) ? y0 : y0 - 1;
        int fieldX1 = (x1 + 1 > fieldLength) ? x1 : x1 + 1;
        int fieldY1 = (y1 + 1 > fieldLength) ? y1 : y1 + 1;

        for (int y = fieldY0; y <= fieldY1; y++) {
            if (check > 0) break;
            for (int x = fieldX0; x <= fieldX1; x++) {
                if (check > 0) break;
                check = field[x][y];
            }
        }
        return check > 0;
    }

    private static void showField(int[][] result) {
        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int[] searchPoint(int[][] field) {
        int fieldLength = field.length - 1;
        int[] points = new int[]{new Random().nextInt(fieldLength), new Random().nextInt(fieldLength)};
        return (field[points[0]][points[1]] == 0) ? points : searchPoint(field);
    }

    public static int[][] fillShip(int[][] field, int x0, int y0, int x1, int y1) {
        for (int y = y0; y <= y1; y++) {
            for (int x = x0; x <= x1; x++) {
                field[x][y] = 1;
            }
        }
        return field;
    }
}
