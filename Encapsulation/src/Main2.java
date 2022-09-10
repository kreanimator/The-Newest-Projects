public class Main2 {
    public static void main(String[] args) {
        CourierService toMoscow = new CourierService(new Dimensions(200,35,40),350,
                "Проспект Андропова 36 кв. 85",
                "FD34567",true,false);
        System.out.println( toMoscow);

        System.out.println(" ");

        CourierService toIsrael = new CourierService(new Dimensions(34, 5 ,6), 25,
                "Улица Дизенгофф 45 кв. 30",
                 "RT4545", true,false);
        System.out.println( toIsrael);

    }
}
