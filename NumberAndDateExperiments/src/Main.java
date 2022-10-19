
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        int d = 5;

        int c1 = --a + a --;//8
        int c2 = b-- + --b;//8
        int c3 = ++c - c++;
        int c4 = d++ - ++d;

        System.out.println(c1 + "" + c2 + "" + c3 + "" + c4);

        int i = 5;
        int g = i++;
        System.out.println(i + "" + g);


    }
}

