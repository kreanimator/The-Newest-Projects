public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());


        for (char c = 'Ё'; c <= 'ё'; c++) {
            if ((c > 'Ё' && c < 'А') || (c > 'я' && c < 'ё')) {
                continue;
            }
            System.out.println(c + " (" + ((int) c) + ")");
        }


        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

    }
}
