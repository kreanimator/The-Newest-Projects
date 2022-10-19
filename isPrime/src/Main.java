public class Main {

    public static void main(String[] args) {

        primes();
    }
    private static void primes() {
        for (int i = 0; i < 20; i++) {
            boolean flag = isPrime(i);
            if (flag) {
                System.out.println("> " + i);
            } else {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

