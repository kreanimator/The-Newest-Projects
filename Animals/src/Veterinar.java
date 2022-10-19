public class Veterinar {

    void treatAnimal (Animal animal){
        System.out.println("Animal name: " + animal.name);
        animal.makeNoise();
        animal.eat();
        System.out.println(animal.food);
        System.out.println(animal.location);
        System.out.println("Animal: ");animal.sleep();
        System.out.println("Animal " + animal.name + " is in queue to veterinar. \n");
    }
}
