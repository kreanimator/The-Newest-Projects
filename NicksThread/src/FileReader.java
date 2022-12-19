import java.io.FileWriter;
import java.sql.Struct;
import java.util.Random;

public class FileReader implements Runnable {
    PublicSource publicSource;



    CustomStringWrapper [] data;
    int changerCounter;


    public FileReader(PublicSource publicSource){
        this.publicSource;
    }
    @Override
    public void run() {
        while(true){
            try{
            if (publicSource.changeCounter >=10){
                this.Dump();
            }
                Thread.sleep(100);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
    public void printThread(Object obj){
        System.out.println(Thread.currentThread().getName() + " - " + obj.toString() );
    }
    public void Dump(){
        String res = "";
        CustomStringWrapper[] data = publicSource.getData();
        for(CustomStringWrapper str:data){
            res += str + "|";
        }

        FileWriter fw = new FileWriter("src/customfilewriter.txt",true);
        fw.write(res);
        printThread(res);
        fw.write(res + "\n");
    }

}
