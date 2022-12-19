import java.security.PublicKey;

public class App {
    public static void main(String[] args) {
        PublicSource publicSource = new PublicSource();


        Thread [] threads = new Thread[5];
        for ( int i = 0; i < threads.length; i ++){
            threads[i] = new Thread(new FileWriter(publicSource));
            threads[i].start();
        }
        new Thread(new FileReader(publicSource).start);

    }
}
//Задача 1. Создать класс общеступный ресурс, который будет содержать в себе массив с данными содержащий в себе
// строку и уникальную позицию. Строка генерируется и состоит из случайных символов. Создать два класса для работы с потоками.
// Один из них записывает данные в файл каждые 10 изменений данных в общем массиве и работает бесконечно.
// Второй берет одну строку из массива и меняет все буквы в строке следующим образом. Например строка ABBCCA,
// генерируется случайное число(например два) и каждый символ в строке меняется на следующий с учётом сдвига в алфавите.
// Получаем строку BDDEEB.

//Задача 2. Расширить задачу 1. В общедоступный ресурс массив строк будет загружаться из файла.
// Создать дополнительный класс или расширить имеющийся для работы с потоками, который должен будет брать строку и
// менять символы обратно, с учётом сдвига(из BDDEEB получаем ABBCCA).
//Программа должна считать текст из файла, в многопоточном режиме обработать все строки,
// через каждые 10 изменений сохранять все данные в новый файл. Главный поток должен дождаться завершения этих потоков,
// считать финальную версию файла и в многопоточном режиме преобразовать в исходный текст.
// Результат преобразования сохранить в файл.
//*После выполнения программы файлы “бэкапов” удаляются.