package LinkedList;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
        this.prev = null;
    }
    Node(int data,Node next,Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class DoubleLinkedList {

    public static Node insertDDL(int[] arr){
        if (arr.length == 0){
            return  null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
        System.out.println();
    }
    public static Node deleteHead(Node head){
        if (head == null|| head.next == null){
            return  null;
        }
        Node prev = head;
        head= head.next;
        head.prev = null;
        prev.next = null;

        return  head;
    }
    public static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return  null;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node newnode = temp.prev;
        newnode.next = null;
        temp.prev = null;

        return head;
    }

    public static Node deleteKelement(Node head,int k){

        Node temp = head;
        int cnt = 0;
        while (temp!=null){
            cnt++;
            if(cnt == k){
                break;
            }
            temp = temp.next;
        }

        Node back = temp.prev;
        Node front = temp.next;

        if(back == null && front == null){
            return  null;
        } else if (back == null) {
            deleteHead(head);
        } else if (front == null) {
            deleteTail(head);
        }else{
            back.next = front;
            front.prev = back;
            temp.next = null;
            temp.prev = null;
        }

        return  head;
    }
    public static void deleteNode(Node node){
        Node back = node.prev;
        Node front = node.next;

        back.next = front;
        front.prev = back;

        node.next = node.prev = null;

    }
    public static Node insertHead(Node head,int element){

        Node newNode = new Node(element,head);
        head.prev = newNode;
        return newNode;
    }
    public static Node insertTail(Node head,int element){
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        Node newTail = new Node(element,null);
        temp.next = newTail;
        newTail.prev = temp;

        return head;
    }
    public static Node insertKPosition(Node head,int element,int k){

        if(k==1){
            return insertHead(head,element);
        }
        Node temp = head;
        int cnt = 0;
        while (temp !=null){
            cnt++;
            if(cnt == k){
                break;
            }
            temp = temp.next;
        }
        Node back = temp.prev;
        Node newNode = new Node(element,temp,back);
        back.next = newNode;
        temp.prev = newNode;


        return head;
    }

    public static void insertNode(Node node,int element){
        Node back = node.prev;
        Node newNode = new Node(element,node,back);
        back.next = newNode;
        node.prev = newNode;


    }

    public static void main(String[] args) {
        int[] arr = {8,6,4,1,7,10};
        Node head = insertDDL(arr);
        print(head);

        insertNode(head.next.next,66);
        print(head);
//        head = insertTail(head,30);
//        print(head);
//        Node curr = insertHead(head,100);
//        print(curr);
//        deleteNode(head.next.next.next);
//        print(head);
//        head = deleteKelement(head,3);
//        print(head);
//        head = deleteHead(head);
//        print(head);
//        head = deleteTail(head);
//        print(head);

    }
}
