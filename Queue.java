package queue;

public class Queue {
    int front , rear , size;
    int capacity;
    int array[];
    public Queue(int capacity){
        this.capacity = capacity;
        rear = front = -1;
        this.size=0;
        array = new int[this.capacity];
    }

    public boolean isFull(Queue queue){
        return (queue.size == queue.capacity);
    }

    public boolean isEmpty(Queue queue){
        return (queue.size == 0);
    }

    public void enQueue(Queue queue , int x){
        if(isFull(queue)){
            System.out.println("Queue is FULL");
            return;
        }
        ++this.rear;
        this.array[this.rear] = x;
        ++this.size;
        System.out.println(x + "\tenqueued to queue");

    }

    public int deQueue(Queue queue){
        if(isEmpty(queue)){
            System.out.println("Queue is EMPTY");
            return -1;
        }
        size--;
        int x = this.array[front+1];
        this.array[front+1]=-1;
        front++;
        return x;
    }


    public static void main(String[] args) {
        Queue queue = new Queue(100);
        queue.enQueue(queue,10);
        queue.enQueue(queue,15);
        queue.enQueue(queue,16);
        queue.enQueue(queue,13);
        queue.enQueue(queue,12);
        System.out.println(queue.deQueue(queue));
        System.out.println(queue.deQueue(queue));
        System.out.println(queue.deQueue(queue));
        System.out.println(queue.deQueue(queue));
        System.out.println(queue.deQueue(queue));
        System.out.println(queue.deQueue(queue));
        Queue queue1 = new Queue(100);
        queue1.enQueue(queue1,10);
        queue1.enQueue(queue1,13);
        queue1.enQueue(queue1,14);
        queue1.enQueue(queue1,11);
        queue1.enQueue(queue1,1);
        System.out.println(queue1.deQueue(queue1));
        System.out.println(queue1.deQueue(queue1));
        System.out.println(queue1.deQueue(queue1));
        System.out.println(queue1.deQueue(queue1));
        System.out.println(queue1.deQueue(queue1));
        System.out.println(queue1.deQueue(queue1));

    }

}
