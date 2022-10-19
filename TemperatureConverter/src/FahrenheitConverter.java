public class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
