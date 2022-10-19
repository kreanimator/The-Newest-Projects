public class MoneyCalculator {

    private static final int BANKNOTES_PER_PACK = 100;
    private static final int PACKS_IN_CASSETTE = 20;

    public static int calculateCassetteCount (int banknoteCount) {

        int packsCount = banknoteCount / BANKNOTES_PER_PACK +
                (banknoteCount % BANKNOTES_PER_PACK == 0 ? 0 : 1);
        int cassetteCount = packsCount / PACKS_IN_CASSETTE +
                (packsCount % PACKS_IN_CASSETTE == 0 ? 0 : 1);
        return cassetteCount;
    }
}
