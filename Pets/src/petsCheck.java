public class petsCheck {
    public static void main(String[] args) {
        while (true) {
            Pet pet = new Pet();
            pet.name = "Барсик";
            pet.animal = "Кошка";
            pet.age = 35;
            System.out.println(" Кличка животного:" + pet.name +
                    "\n Вид животного:" + pet.animal +
                    "\n Возвраст животного: " + pet.age);
            System.out.println("");

            Pet pet1 = new Pet();
            pet1.name = "Рекс";
            pet1.animal = "Тиранозавр";
            pet1.age = 99;
            System.out.println(" Кличка животного:" + pet1.name +
                    "\n Вид животного:" + pet1.animal +
                    "\n Возвраст животного: " + pet1.age);
            break;


        }

    }
}
