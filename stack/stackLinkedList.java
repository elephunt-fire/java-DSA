package stack;
class Node{
    int val ;
    Node next;
    Node(int val){
        this.val = val ;
        this.next = null;
    }
}

public class stackLinkedList {
    static Node head;

    public static void push(int val){
        Node node = new Node(val);
        node.next =head;
        head = node ;
    }

    public  static int pop(){
    if(head == null ) throw new RuntimeException("empty");

    int top = head.val;
    head = head.next;
    return  top;
    }

    public static int peek(){
        if(head == null) throw new RuntimeException("empty");
        return head.val;
    }

    public static boolean isempty(){
        return head == null;
    }


    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(peek());
    }
}

// Execution :

//Top -> null
//Top -> 10 -> null || push (10)
//Top -> 20 -> 10 -> null || push(20)
//Top -> 30 -> 20 -> 10 -> null || push(30)


