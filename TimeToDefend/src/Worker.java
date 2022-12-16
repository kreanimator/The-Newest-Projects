import java.util.concurrent.Semaphore;

public class Worker implements Runnable {

    Forest forest;
    Camp camp;
    Semaphore semaphore;

    private int stamina;
    private int resources;

    public Worker(Forest forest, Camp camp, Semaphore semaphore) {
        this.forest = forest;
        this.camp = camp;
        this.semaphore = semaphore;
        this.stamina = 3;
        this.resources = 0;
    }

    @Override
    public void run() {
        while (this.stamina>0) {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " in the forest....");
                this.stamina--;
                this.resources = this.forest.getWood();
                this.camp.addWood(this.resources);
                this.resources = 0;
                semaphore.release();
                System.out.println(Thread.currentThread().getName() + " left the forest....");
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }
}
