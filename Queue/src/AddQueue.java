public class AddQueue implements Queue{
    int rear;
    int maxSize;
    int [] queueArray;
    int currentSize;
    int front;


    public AddQueue (int el){
        return;
    }

    @Override
    public int AddQueue(int el) {
            //check if queue is already full
            if(isEmpty()){
                System.out.println("Queue is full!");
                return el;
            }
            // for wrapping the queue in case
            //  max size has reached
            if(rear == maxSize - 1){
                rear = -1;
            }
            // increment rear then insert item
            queueArray[++rear] = el;
            currentSize++;
            System.out.println("Added to queue" + el);
        return el;
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
