import java.util.Scanner;

class linkedList {


    static class Node {
        int data;
        Node next;
    };


    static Node removeFromLast(Node head)
    {
        if (head == null)
            return null;

        if (head.next == null) {
            return null;
        }


        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;


        second_last.next = null;

        return head;
    }


    static Node addAtFirst(Node head, int new_data)
    {
        Node newNode = new Node();
        newNode.data = new_data;
        newNode.next = head;
        head = newNode;
        return head;
    }

    int  objectAt(Node head, int pos){
        if (head == null)
            return -1;

        Node pre = head;
        int count = 1;
        while (pre.next != null && count != pos) {
            count++;
            pre = pre.next;
        }
        return pre.data;
    }

    int firstObject(Node head){
        if (head == null)
            return -1;

        else
            return head.data;
    }

    int indexOf(Node head, int data1){
        if (head == null)
            return -1;

        Node pre = head;
        int count = 1;
        while (pre.next != null && pre.data != data1) {
            count++;
            pre = pre.next;
        }
        return count;
    }

    public static void main(String args[])
    {

        Node head = null;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i= 0;
        for(i=0; i<n; i++){
            int data = scan.nextInt();
            head = addAtFirst(head, data);
        }
        head = removeFromLast(head);
        int pos = scan.nextInt();
        linkedList list = new linkedList();
        int t = list.objectAt(head, pos);
        System.out.println(t);
        int k = list.firstObject(head);
        System.out.println(k);
        int data1 = scan.nextInt();
        int o = list.indexOf(head, data1);
        System.out.println(o);
    }
}