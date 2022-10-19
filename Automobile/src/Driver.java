public class Driver extends Person {

    int drivingStage;

    public Driver(int drivingStage) {
        this.drivingStage = drivingStage;
    }

    public Driver(String fullName, int age, int drivingStage) {
        super(fullName, age);
        this.drivingStage = drivingStage;
    }

    public void drivingStage() {
        System.out.println("My driving stage is " + getDrivingStage());
    }

    public int getDrivingStage() {
        return drivingStage;
    }


}
