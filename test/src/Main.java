public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i > 20) {
            if (i > 6 && i < 10) {
                continue;
            }
            System.out.println("YES");
            i = i + 1;
        }
    }
}
