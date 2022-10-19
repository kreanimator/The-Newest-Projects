import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try {
            char[] symbols = {'a', 'b', 'c'};
            OutputStream output = new FileOutputStream("a.txt");
            for (char symbol : symbols) {

                // Запись каждого символа в текстовый файл
                output.write(symbol);
            }
            output.close();

            InputStream input = new FileInputStream("a.txt");
            int size = input.available();

            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }            try(FileInputStream fin = new FileInputStream("src\\io\\text.txt"))
            {

            System.out.println("If you see this message, it means that everything is good:)");
        }
            input.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
