public class TestQueue implements Queue {
    public void main(String[] args) {
        QueueArray queue = new QueueArray(10);
        Queue.AddQueue(1);
        Queue.AddQueue(2);
        Queue.AddQueue(3);
        Queue.AddQueue(4);
        Queue.RemoveQueue(1);
        System.out.println(queue);







    }

    @Override
    public int AddQueue(int el) {
        return 0;
    }

    @Override
    public int RemoveQueue(int el) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int AddQueue() {
        return 0;
    }
}
