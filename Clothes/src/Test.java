public class Test {
    public static void main(String[] args) {
        Clothes [] clothes = {
                new TShirt(ClothesSize.XS, "Black", 200),
                new TShirt(ClothesSize.L, "Grey", 150),
                new Trousers(ClothesSize.S, "Pink", 100),
                new Trousers(ClothesSize.L, "Brown", 300),
                new Skirt(ClothesSize.S,"Red", 200),
                new Skirt(ClothesSize.S, "Green", 100),
                new Tie(ClothesSize.L, "Red", 20),
                new Tie(ClothesSize.S, "Blue",25),
        };
        Atelier studio = new Atelier();
        studio.dressMale(clothes);
        System.out.println();
        studio.dressFemale(clothes);
        System.out.println();

        }
    }
