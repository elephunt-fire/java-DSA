package queue;

class queueUsingArray{
    int [] arr;
    int size ;
    int front  ;
    int rear;

    queueUsingArray(int size){
        this.size = size;
        arr = new int[size];
        front = 0;
        rear =-1;
    }

    boolean offer(int val){
        if(rear == size-1){
            System.out.println("queue is full");
            return  false;
        }
        rear++;
        arr[rear] = val;
        return true;
    }

    int poll (){
        if(isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        return arr[front++];
    }
    int peek(){
        if(isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        return arr[front];
    }

    boolean isEmpty(){
        return  front>rear;
    }
}
public class curd {
    public static void main(String[] args) {

        queueUsingArray q = new queueUsingArray(5);
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
