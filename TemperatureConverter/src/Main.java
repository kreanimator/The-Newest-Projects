public class Main {
    public static void main(String[] args) {
        double temperature = 23.5;
        System.out.println("t in Celsius = " +
                new CelsiusConverter().getConvertedValue(temperature));
        System.out.println("t in Kelvins = " +
                new KelvinConverter().getConvertedValue(temperature));
        System.out.println("t in Fahrenheits = " +
                new FahrenheitConverter().getConvertedValue(temperature));
    }
}
