package linkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data ;
        this.next= null;
    }
}

public class ll1 {
    public  static void printing(Node head){
        Node cur = head;
        while (cur!=null){
            System.out.println(cur.data + "=>");
            cur = cur.next;
        }
        System.out.print("null");
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node cur = head;

        while (cur!=null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static int middleTerm(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("The middle element is: ");
        return slow.data;
    }

    public  static  void searchVal( Node head , int val){
        Node cur = head;
        while(cur!= null){
            if(cur.data == val){
                System.out.println("found");
                return;
            }
            else {
                cur = cur.next;
            }
        }
        System.out.println("not found");
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        Node secound = new Node(20);
         head.next = secound;

        Node third = new Node(30);
        secound.next = third;

        // revesing
        printing(head);
        System.out.println("\n "+"printing the reverse");
        head = reverse(head);
        printing(head);

        // middle element
        System.out.println();
        int result = middleTerm(head);
        System.out.println(result);;

        // searching a value
        searchVal(head , 10);
    }
}
