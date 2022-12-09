import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Unit> units = new ArrayList<>(200);
        units.add(new King());
        for (int i = 0; i < 10; i++) {
            units.add(new Nobles());
        }
        for (int i = 0; i < 25; i++) {
            units.add(new Knights());
        }
        for (int i = 0; i < 100; i++) {
            units.add(new Peasants());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Day: " + (i + 1));
            for (int j = 0; j < units.size(); j++) {
                Unit current = units.get(j);
                if (current.isAlive()) {
                    current.getDamage(random.nextInt(15));
                    current.status();
                } else {
                    System.out.println("Dead :(");
                    current.status();
                }
            }
        }
        int counter = 0;
        for (Unit u : units) {
            if (!u.isAlive()) {
                counter++;
            }
        }
        System.out.println("We have " + counter + " dead people after plague");
    }
}
