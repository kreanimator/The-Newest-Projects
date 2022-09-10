public class Main {
    public static void main(String[] args) {
        DogHouse dogHouse = new DogHouse("Приют");
        dogHouse.setDogName("Бэдвир");
        dogHouse.setDogCount(1);
        dogHouse.setDogHeight(25);
        dogHouse.setBreed("Корги");

        System.out.println("Приют: Дом");
        System.out.println("Имя: " + dogHouse.getDogName());
        System.out.println("Порода: " + dogHouse.getBreed());
        System.out.println("Количество: " + dogHouse.getDogCount());
        System.out.println("Рост: " + dogHouse.getDogHeight());



    }
}
