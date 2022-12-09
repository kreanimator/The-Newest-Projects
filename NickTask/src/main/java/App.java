import java.util.Comparator;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        TreeMap <String,Integer> knights = new TreeMap <>();
        knights.put("George", 100);
        knights.put("Arthur", 50);
        knights.put("Nick",110);
        knights.put("Michael Vainstein", 200);
        knights.put("Scholar of Ayanot",5);

        System.out.println("Not sorted " + knights);
        Comparator<? super String> comp = knights.comparator();
        System.out.println("Sorted: " + comp);

        }


    }

