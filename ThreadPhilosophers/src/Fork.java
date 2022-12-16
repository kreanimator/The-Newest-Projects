public class Fork implements Runnable{

    private static int count =0;
    private int id;
    private boolean isBusy;

    public Fork() {
        id = ++count;
        isBusy = false;
    }
    public synchronized void take() {
        if (isBusy) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " took sjdnfm fork " + id);
        isBusy = true;
    }

    public synchronized void drop() {
        System.out.println(Thread.currentThread().getName() + " dropasd sfsf sdfsdf fork " + id);
        isBusy = false;
        notify();
    }

    @Override
    public void run() {

    }
}
