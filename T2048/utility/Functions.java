package T2048.utility;

public class Functions {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int [] arr) {
        for(int i = 0; i < arr.length / 2; ++i) {
            swap(arr, i, arr.length - i - 1);
        }
    }
}