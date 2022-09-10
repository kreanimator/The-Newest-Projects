public class CourierService {


    private final Dimensions dimensions;
    private final double luggageWeight;

    private final String luggageAddress;


    private final String luggageRegCode;
    private final boolean turnable;
    private final boolean fragile;

    public CourierService(Dimensions dimensions, double luggageWeight, String luggageAddress,
                          String luggageRegCode, boolean turnable, boolean fragile) {
        this.dimensions = dimensions;
        this.luggageWeight = luggageWeight;
        this.luggageAddress = luggageAddress;
        this.luggageRegCode = luggageRegCode;
        this.turnable = turnable;
        this.fragile = fragile;
    }
    @Override
    public String toString() {
        return "Посылка отправлена!" + "\n" +
                "Объем посылки:" + dimensions +"\n" +
                "Вес посылки:" + luggageWeight + "\n" +
                "Адрес посылки:" + luggageAddress + "\n" +
                "Номер отправления:" + luggageRegCode + "\n" +
                "Можно ли переворачивать:" + turnable + "\n" +
                "Хрупкое:" + fragile;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getLuggageWeight() {
        return luggageWeight;
    }

    public String getLuggageAddress() {
        return luggageAddress;
    }

    public String getLuggageRegCode() {
        return luggageRegCode;
    }

    public boolean isTurnable() {
        return turnable;
    }

    public boolean isFragile() {
        return fragile;
    }
}
