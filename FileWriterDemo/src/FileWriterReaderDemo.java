import java.io.*;

public class FileWriterReaderDemo {
    public static void main(String[] args) throws IOException {
        File dir = new File("");

            String source = dir.getCanonicalPath() + File.separator + "Code.txt";
            String dest = dir.getCanonicalPath() + File.separator + "Dest.txt";

            File fin = new File(source);
            FileInputStream fis = new FileInputStream(fin);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            FileWriter fstream = new FileWriter(dest, true);
            BufferedWriter out = new BufferedWriter(fstream);

            String aLine = null;
            while ((aLine = in.readLine()) != null) {
                //Process each line and add output to Dest.txt file
                out.write(aLine);
                out.newLine();
            }

            // do not forget to close the buffer reader
            in.close();

            // close buffer writer
            out.close();
        }
    }

