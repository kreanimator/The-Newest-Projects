
import java.io.IOException;
import java.util.Random;

public class FileWriter implements Runnable{

    PublicSource publicSource;


    public FileWriter (PublicSource publicSource){
        this.publicSource = publicSource;
    }
    @Override
    public void run(){
        Random random = new Random();
        CustomStringWrapper str;
        int shift = random.nextInt(4)+1;
        while (true){
            str = publicSource.getString();
            printThread("before: " + str);
            changedString(str,shift);
            printThread("after: " + str);
            publicSource.JobDone();
            try {
                Thread.sleep(1000);
            }catch ( InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void printThread(Object obj){
        System.out.println(Thread.currentThread().getName()+" - "+ obj.toString());
    }
    public void changedString(CustomStringWrapper customStr, int shift){
        String res = "";
        int index = 0;
        for (int i =0; i< customStr.data.length(); i++){
            index = (int)(customStr.data.charAt(i))+shift;
            if(index > 90){
                index -= 26;
            }
            res += (char)index;
        }
        customStr.data = res;
    }
}
