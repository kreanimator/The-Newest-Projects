public class app {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(0,30));
        Thread t2 = new Thread(new MyThread(30,60));
        Thread t3 = new Thread(new MyThread(60,100));


        t1.start();
        //стартуем второй поток только после 2-секундного ожидания первого потока (или когда он умрет/закончит выполнение)
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        //стартуем 3-й поток только после того, как 1 поток закончит свое выполнение
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();

        //даем всем потокам возможность закончить выполнение перед тем, как программа (главный поток) закончит свое выполнение
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        NewThread newThread = new NewThread(0,100);
        newThread.start();
    }
}
//        MyRunnable myRunnable = new MyRunnable();
//        MyThread[] myThreads = new MyThread[3];
//        for (int i = 0; i < 3; i++) {
//            myThreads[i] = new MyThread();
//        }
//        for (Thread thread : myThreads) {
//            thread.start();
//        }