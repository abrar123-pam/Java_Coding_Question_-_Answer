package LinkedList;

public class LinkedList {
    Node head;
    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void display(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
}
