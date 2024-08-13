package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.addElement(80);
        heap.addElement(90);

        heap.addElement(120);

        heap.addElement(10);
        heap.addElement(18);
        heap.addElement(15);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        pq.add(10);
        pq.add(20);
        pq.add(22);
        pq.add(12);
        pq.add(100);
        System.out.println(pq);

        heap.print();
        heap.minHeapify(0);
        heap.print();
        heap.maxHeapify(0);
        heap.print();
        heap.sort();
        heap.print();
//        heap.decreaseKey(3,30);
//        heap.print();
//        heap.deleteKey(4);
//        heap.print();
//        //System.out.println(heap.left(1));
//        System.out.println(heap.getMin());
//        System.out.println(heap.extractMin());

    }
}
