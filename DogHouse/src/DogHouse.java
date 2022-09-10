public class DogHouse {



    private String dogName;
    private int dogCount;
    private double dogHeight;
    private String breed;
    boolean nose;
    public DogHouse(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getDogCount() {
        return dogCount;
    }

    public void setDogCount(int dogCount) {
        this.dogCount = dogCount;
    }

    public double getDogHeight() {
        return dogHeight;
    }

    public void setDogHeight(double dogHeight) {
        this.dogHeight = dogHeight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isNose() {
        return nose;
    }

    public void setNose(boolean nose) {
        this.nose = nose;
    }
}
