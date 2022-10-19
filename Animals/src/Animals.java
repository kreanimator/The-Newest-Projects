public class Animals {
    public static void main(String[] args) {
        Veterinar veterinar = new Veterinar();
        Animal [] animals = new Animal[3];
        animals [0] = new Dog("Chib","Meat","Cage #1");
        animals [1] = new Cat("Fluffy", "Mices", "Cage # 3");
        animals [2] = new Horse("Igogo", "Grass", "Cage #25");



        for (Animal animal : animals){
            veterinar.treatAnimal(animal);

        }

    }
}
