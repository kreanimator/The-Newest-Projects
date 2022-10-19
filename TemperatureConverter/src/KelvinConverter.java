public class KelvinConverter implements TemperatureConverter{

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}
