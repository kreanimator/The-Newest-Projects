import java.util.Random;

class CustomStringWrapper{
    String data;



    @Override
    public String toString() {
        return  data ;
    }

    CustomStringWrapper(String data){
    this.data =data;
    }
}

public class PublicSource {



    CustomStringWrapper [] data;
    int currentCounter;
    int changeCounter;

//    public publicSource{
//        CustomStringWrapper [] data;
//        currentCounter = 0;
//    }
    public PublicSource(){
        data = new CustomStringWrapper[10];
        Random random = new Random();
        for (int i =0 ; i < data.length; i++){
            String str = "";

            for (int j = 0; j < random.nextInt(5)+5; j++){
                str += (char) (random.nextInt(26)+65);
            }
            data[i] = new CustomStringWrapper(str);
            System.out.println(str);
        }
        currentCounter = 0;
        changeCounter = 0;
    }
    public synchronized void JobDone(){
        changeCounter ++;
    }
    public CustomStringWrapper[] getData() {
        return data;
    }

    public synchronized CustomStringWrapper getString(){

        if(currentCounter == data.length){
            currentCounter = 0;
        }
        return data[currentCounter++];
    }


}
