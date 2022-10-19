

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream("file.txt");
            fileOut = new FileOutputStream("copied_file.txt");

            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
            try(FileInputStream fin = new FileInputStream("Demo.txt"))
            {
                //This block is executed successfully
            }catch (IOException e) {
                System.err.println("Caught IOException: " + e.getMessage());

            }

            System.out.println("If you see this message, it means that everything is good:)");
        }

        }
    }
