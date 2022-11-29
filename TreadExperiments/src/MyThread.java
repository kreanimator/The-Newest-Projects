public class MyThread extends Thread implements Runnable{
    private int start, end;

    public MyThread (int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
            for (int i = this.start; i <= end; i++) {
                if (i % 10 == 0) {
                    System.out.println(Thread.currentThread().getName() + " thread:\t" + i + " делится на 10 без остатка");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
            System.out.println();
        }


}
