package LinkedList;

public class Main {

    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();

        list.insertData(2);
        list.insertData(3);
        list.insertData(4);
        list.insertData(5);
        list.insertData(6);

        list.display();
        list.displayRev();
    }
}
