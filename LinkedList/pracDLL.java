package LinkedList;

public class pracDLL {

     class DoubleLinkedList{
        Node head;

        void insertData(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
            }else {
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

            while (curr != null) {
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
            System.out.println("Null");
        }
    }
     class Node{
        int data;
        Node next;
        Node prev;


        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

         pracDLL outer = new pracDLL();
        DoubleLinkedList list = outer. new DoubleLinkedList();

        list.insertData(4);
        list.insertData(7);
        list.insertData(5);
        list.insertData(9);
        list.insertData(1);

        list.display();
    }
}
