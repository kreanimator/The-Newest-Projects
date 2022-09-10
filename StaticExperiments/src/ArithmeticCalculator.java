public class ArithmeticCalculator {

    public int a;
    public int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate (Operation operation){
        switch (operation){
            case ADD -> {
                return a + b;
            }
            case SUBSTRACT -> {
                return a-b;
            }
            case MULTIPLY -> {
                return a * b;
            }
        }

        return 0;

    }

}
