public class Main {
    public static void main(String[] args) {
        Country country = new Country("Малайзия");
        country.setPeopleCount(32763726);
        country.setCountrySquare(329758);
        country.setCapitalName("Куала-Лумпур");
        country.setExitToTheSea(true);

        System.out.println("Страна: " + country.getCountryName());
        System.out.println("Столица: " + country.getCapitalName());
        System.out.println("Население: " + country.getPeopleCount());
        System.out.println("Площадь: " + country.getCountrySquare());

    }
}
