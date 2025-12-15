package queue;

class Node{
    int data ;
    Node next;

    Node(int val){
        data = val;
        next = null;
    }
}

class QueueUsingLinkedList{
    Node front;
    Node rear;

    void offer(int val){
        Node cur = new Node(val);
        if(rear== null ){
            rear = front = cur;
        }

        else {
            rear.next = cur;
            rear = cur;
        }
    }

    int poll(){
        // if queue is empty
        if(front == null){
            throw new RuntimeException("queue is empty");
        }
        int removeVal = front.data;
        front = front.next;

        return removeVal;
    }

    int peek(){
        if(front == null){
            throw new RuntimeException("queue is empty");
        }
        return front.data;
    }

    boolean isEmpty(){
        return front == null;
    }
}
public class queueLists {
    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q.peek()); //1
        System.out.println(q.poll());  // 1
        System.out.println(q.peek()); // 2
        System.out.println(q.isEmpty()); // false
    }
}
