public class Country {



    private String countryName;
    private int peopleCount;
    private double countrySquare;
    private String capitalName;

    boolean exitToTheSea;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }


    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public double getCountrySquare() {
        return countrySquare;
    }

    public void setCountrySquare(double countrySquare) {
        this.countrySquare = countrySquare;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public boolean isExitToTheSea() {
        return exitToTheSea;
    }

    public void setExitToTheSea(boolean exitToTheSea) {
        this.exitToTheSea = exitToTheSea;
    }


}
