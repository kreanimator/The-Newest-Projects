public class Atelier {
    public void dressMale(Clothes[] clothes) {
        System.out.println("Men's clothes in stock:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WearMan) {
                System.out.println(clothe);
            }
        }
    }

    public void dressFemale(Clothes[] clothes) {
        System.out.println("Woman's clothes in stock:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WearWoman) {
                System.out.println(clothe);
            }
        }
    }
}
