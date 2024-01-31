public class quick_Sort {
    public static void main(String[] args) {
        int[] arr = {7,5,4,9,8,1};
        int n = arr.length;

        System.out.println("Before Sorting");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        quickSort(arr,0,n-1);

        System.out.println("\nAfter Sorting");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }


    }

    private static void quickSort(int[] arr, int si, int ei) {

        if(si < ei){
            int partition = partition(arr,si,ei);
            quickSort(arr,si,partition-1);
            quickSort(arr,partition+1,ei);
        }
    }

    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[si];
        int i = si;
        int j = ei;

        while (i<j){
            while (arr[i] <= pivot && i <= ei){
                i++;
            }

            while (arr[j] > pivot && j >= si){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i]  =arr[j];
                arr[j] = temp;
            }
        }
        int temp  =arr[j];
        arr[j] = arr[si];
        arr[si] = temp;

        return  j;
    }
}
