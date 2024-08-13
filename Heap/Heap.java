package Heap;

public class Heap {
    int[] arr;
    int size;
    int capacity;
    int idx;

    public Heap(int capacity) {
        this.arr = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
        this.idx = 0;
    }

    void addElement(int ele){
        if(size == capacity) return;
        arr[size] = ele;
        size++;
        int i = size-1;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    void minHeapify(int i){
        int left = left(i);
        int right = right(i);
        int smallest = i;

        if(left < size && arr[left] < arr[smallest]){
            smallest = left;
        }
        if(right < size && arr[right] < arr[smallest]){
            smallest = right;
        }

        if(smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            minHeapify(smallest);
        }
    }
    void maxHeapify(int i){
        int left = left(i);
        int right = right(i);
        int largest = i;

        if(left < size && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < size && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest != i){
            swap(largest,i);
            maxHeapify(largest);
        }
    }

    void sort(){
      //  buildMaxHeap();

        for (int i = size - 1; i >= 1; i--) {
            swap(0, i);
            size--;
            maxHeapify(0);
        }
    }

    void buildMaxHeap() {
        for (int i = (size / 2) - 1; i >= 0; i--) {
            maxHeapify(i);
        }
    }

    void print(){
        for (int i:arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public int left(int i) {
        return 2*i+1;
    }
    public int right(int r){
        return 2*r+2;
    }
    public int parent(int p){
        return (p-1)/2;
    }
    int getMin(){
        return  arr[0];
    }

    int extractMin() {
        if (size == 0) return -1;
        if (size == 1) {
            size--;
            return arr[0];
        }
        int min = arr[0];
        arr[0] = arr[size - 1];
        size--;
        minHeapify(0);
        return min;
    }

    void decreaseKey(int i, int newValue)
        if (i < 0 || i >= size) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        arr[i] = newValue;

        while (i != 0 && arr[parent(i)] > arr[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    void deleteKey(int i) {
        if (i < 0 || i >= size) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }
    void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
