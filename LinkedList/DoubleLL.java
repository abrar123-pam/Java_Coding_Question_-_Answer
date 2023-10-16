package LinkedList;

public class DoubleLL {

    Node head;


    void insertData(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            Node curr = head;

            while (curr.next != null){
                curr = curr.next;
            }

            curr.next = newNode;
            newNode.prev = curr;
        }
    }
    void display(){

        Node curr = head;

        while (curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }

        System.out.println("NULL");
    }

    void displayRev(){

        Node curr = head;

        while (curr != null && curr.next != null){
            curr = curr.next;
        }

        while (curr != null){
            System.out.print(curr.data +"->");
            curr = curr.prev;
        }
        System.out.println("NULL");
    }

    class  Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node head, Node prev) {
            this.data = data;
            this.next = head;
            this.prev = prev;
        }
    }
}
