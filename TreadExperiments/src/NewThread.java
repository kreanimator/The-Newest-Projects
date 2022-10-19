public class NewThread extends MyThread{

    @Override
    public void run(){
        for (int i =0; i < 100; i ++){
            System.out.println(i);
        }
    }
}
