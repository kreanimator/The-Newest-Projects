public class DogWalkLauncher {
    public static void main(String[] args) {
        dogOwner owner = new dogOwner();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        boolean testDogWalk1 = false;
        boolean testDogWalk2 = false;

        // Specify when the dogs last drank.
        dog1.setDrinkTime(2);
        dog2.setDrinkTime(5);

        // Test the negation of a condition.
        if (!owner.takeForWalk(dog1)) {
            testDogWalk1 = true;
        }

        if (owner.takeForWalk(dog2)) {
            testDogWalk2 = true;
        }

        System.out.println("testDogWalk1: " + testDogWalk1);
        System.out.println("testDogWalk2: " + testDogWalk2);
    }
}

