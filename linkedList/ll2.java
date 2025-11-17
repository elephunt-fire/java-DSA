package linkedList;

class node1 {
    int data;
    node1 next;

    node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ll2 {

    public static void printing(node1 head) {
        node1 cur = head;

        while (cur != null) {
            System.out.print(cur.data + "=>");
            cur = cur.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static boolean linkedlistCycle(node1 head) {
        node1 slow = head;
        node1 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) return true;
        }
        return false;
    }

    public static  node1 addition(node1 l1, node1 l2){
        node1 result = new node1(0);
        node1 cur = result;

        int carry = 0 ;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum+= l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }

            carry = carry / 10;
            int sum1 = sum %10;

            cur.next = new node1(sum1);

            cur = cur.next;
        }
        return result.next;
    }

    public  static  node1 sorting(node1 l1 ,node1 l2 ){

        node1 dummy = new node1(-1);
        node1 tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null){
            tail.next = l1;
        }
        else {
            tail.next = l2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        node1 head = new node1(10);
        node1 second = new node1(20);
        head.next = second;

        node1 third = new node1(30);
        second.next = third;

        // cycle linked list
        printing(head);
        System.out.print("\nis the list cyclic? " + linkedlistCycle(head));

        System.out.println();

        third.next = second;
        //printing(head);
        System.out.println("after maing cycle :" + linkedlistCycle(head));


        // addition of two linked lists
        node1 l1 = new node1(2);
        node1 secound_l1 = new node1(4);
        l1.next = secound_l1;
        node1 third_l1 = new node1(3);
        secound_l1.next = third_l1;

        node1 l2 = new node1(5);
        node1 secound_l2 = new node1(6);
        node1 third_l2 = new node1(4);

        l2.next = secound_l2;
        secound_l2.next = third_l2;

        printing(l1);
        printing(l2);

        System.out.println("addition of these two are : ");
        node1 result = addition(l1,l2);
        printing(result);


        // sorting two linked lists
        System.out.println("Sorting:");

        node1 list1 = new node1(2);
        node1 second_list1 = new node1(3);
        list1.next = second_list1;
        node1 third_list1 = new node1(4);
        second_list1.next = third_list1;

        node1 list2 = new node1(1);
        node1 second_list2 = new node1(5);
        list2.next = second_list2;
        node1 third_list2 = new node1(6);
        second_list2.next = third_list2;

        System.out.print("List 1: ");
        printing(list1);
        System.out.print("List 2: ");
        printing(list2);
        System.out.println();

        node1 head_d = sorting(list1, list2);
        System.out.print("Merged Sorted List: ");
        printing(head_d);
    }
}
