package queue;

class circularQueueUsingArray{
    int [] arr;
    int size ;
    int front  ;
    int rear;

    circularQueueUsingArray(int size){
        this.size =size;
        front = -1 ;
        rear = -1 ;
        arr= new int[size];
    }

    boolean offer(int val){
        if((rear +1 ) % size == front){
            System.out.println("queue is full");
            return false;
        }

        if (front == -1 )  front = 0;

        rear = (rear+1) % size ;
        arr[rear] = val ;
        return true;
    }

    int poll(){
        if (isEmpty()) throw new RuntimeException("queue is empty;");

        int result = arr[front];
        if(front == rear ) front = rear = -1;
        else front = (front+1) % size ;
        return  result;
    }

    int peek (){
        return arr[front];
    }

    boolean isEmpty(){
        return front == -1;
    }
}
public class circularQueue {
    public static void main(String[] args) {

        circularQueueUsingArray queue = new circularQueueUsingArray(5);
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
