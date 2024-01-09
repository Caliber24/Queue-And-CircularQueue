package queue;

public class CircularQueue {
    public int rear , front , capacity , size;
    public int array[];

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.size=1;
        this.front=this.rear=0;
        array = new int[capacity];
    }

    public boolean isFull(CircularQueue cQueue){
        return (cQueue.size == cQueue.capacity);
    }

    public boolean isEmpty(CircularQueue cQueue){
        return (cQueue.size == 1);
    }

    public void enQueue(CircularQueue cQueue , int x){
        
        if(isFull(cQueue)){
            System.out.println("Queue is FULL");
            return;
        }
        rear = (rear+1)%this.capacity;
        this.array[this.rear] = x;
        ++this.size;
        System.out.println(x + "\tenqueued to queue");

    }

    public int deQueue(CircularQueue cQueue){
        if(isEmpty(cQueue)){
            System.out.println("Queue is EMPTY");
            return -1;
        }

        size--;
        front = (front + 1)% this.capacity;
        int x = this.array[front];
        this.array[front]=0;
        return x;
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);

        circularQueue.enQueue(circularQueue,12);
        circularQueue.enQueue(circularQueue,11);
        circularQueue.enQueue(circularQueue,10);
        circularQueue.enQueue(circularQueue,14);
        circularQueue.enQueue(circularQueue,43);

        System.out.println(circularQueue.deQueue(circularQueue));
        System.out.println(circularQueue.deQueue(circularQueue));
        System.out.println(circularQueue.deQueue(circularQueue));
        System.out.println(circularQueue.deQueue(circularQueue));
        System.out.println(circularQueue.deQueue(circularQueue));
    }
}
