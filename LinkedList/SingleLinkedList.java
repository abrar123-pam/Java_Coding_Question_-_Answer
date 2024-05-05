import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}
public class SingleLinkedList {

    public static Node addelementsLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static boolean searchelement(Node head, int val){

        Node temp = head;
        while (temp != null) {
            if(temp.data == val){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }
    public static Node deletehead(Node head){
        Node temp = head;
        head = head.next;

        return head;
    }

    public static Node deletetail(Node head){
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deletekelm(Node head,int element){

        if(head == null){
            return null;
        }
        if(element == 1){
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            cnt++;
            if(cnt == element){
                prev.next= prev.next.next;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;

    }

    public static Node deleteelement(Node head,int element){

        if(head == null){
            return null;
        }
        if(head.data == element){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {

            if(temp.data == element){
                prev.next= prev.next.next;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;

    }

    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node inserthead(int element, Node head){
        return new Node(element,head);
    }

    public static Node insertail(int element, Node head){
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node add = new Node(element);
        temp.next = add;
        return head;
    }

    public static Node inserposition(int element,int k,Node head){
        if(head == null){
            if(k == 1){
                return new Node(element);
            }
        }
        if(k == 1){
            return new Node(element, head);
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;

            if(cnt == k-1){
                Node add = new Node(element);
                add.next = temp.next;
                temp.next = add;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {8,6,4,1,7};

        Node head = addelementsLL(arr);
        print(head);

        head = inserposition(10,3,head);
        print(head);

        // head = inserthead(100,head);
        // print(head);

        // head = insertail(24,head);
        // print(head);

        // head = deleteelement(head,1);
        // print(head);

        // head = deletekelm(head,3);
        // print(head);

        // head = deletehead(head);
        // print(head);

        // head = deletetail(head);
        // print(head);



    }
}