public class app {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        MyThread[] myThreads = new MyThread[3];
        for (int i = 0; i < 3; i++) {
            myThreads[i] = new MyThread();
        }
        for (Thread thread : myThreads) {
            thread.start();
        }
        NewThread newThread = new NewThread();
        newThread.start();
    }
}
