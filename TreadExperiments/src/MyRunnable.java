public class MyRunnable {
    private MyQueue myQueue;

    public void Producer (MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.put(i);
        }
    }
}
