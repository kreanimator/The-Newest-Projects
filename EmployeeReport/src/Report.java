import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Report {
    public void generateReport() throws IOException {
        File file = new File (".");
        PrintWriter printWriter = new PrintWriter ("report.txt");
        FileWriter fileWriter = new FileWriter("report.txt");
        fileWriter.write(toString());
//        printWriter.println (toString());
//        printWriter.close ();
    }



}
