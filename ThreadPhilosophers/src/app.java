public class app {
    public static void main(String[] args) {
        Fork[] forks = new Fork[5];
        for (int i =0 ; i < 5; i++) {
            forks [i] = new Fork();
        }

        Thread phil1 = new Thread(new Philosopher(forks[4], forks[0]));
        phil1.setName("Daniel");
        Thread phil2 = new Thread(new Philosopher(forks[0], forks[1]));
        phil2.setName("Rambam");
        Thread phil3 = new Thread(new Philosopher(forks[2], forks[1]));
        phil3.setName("Hayam");
        Thread phil4 = new Thread(new Philosopher(forks[2], forks[3]));
        phil4.setName("Demosphen");
        Thread phil5 = new Thread(new Philosopher(forks[4], forks[3]));
        phil5.setName("Pifagor");

        phil1.start();
        phil2.start();
        phil3.start();
        phil4.start();
        phil5.start();
    }
        }
