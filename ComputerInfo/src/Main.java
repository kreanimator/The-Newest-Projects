public class Main {
    public static void main(String[] args) {
        System.out.println("Информация о системе");
        System.out.print("Операционная система: ");
        System.out.print(System.getProperty("os.name") + " ");
        System.out.println(System.getProperty("os.version"));
        System.out.print("Количество ядер процессора: ");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.print("Количество памяти, доступной JVM: ");
        System.out.println(
                Runtime.getRuntime().maxMemory() / 1024 / 1024 + "Mb"
        );

    }
}
