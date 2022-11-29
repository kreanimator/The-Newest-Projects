public class NewThread extends MyThread{

    public NewThread(int start, int end) {
        super(start, end);
    }

    @Override
    public void run(){
        for (int i =0; i < 100; i ++){
            System.out.println(i);
        }
    }
}
