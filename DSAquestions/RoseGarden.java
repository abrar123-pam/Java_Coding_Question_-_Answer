package DSAquestions;

public class RoseGarden {

    public static void main(String[] args) {
        int [] a = {2, 4, 6};
        int[] b = {1,3,5};

        int n = a.length;
        int m = b.length;

        int i=0,j=0,k=0;
        int[] temp = new int[n+m];

        while(i<n && j<m){
            if(a[i]<=b[j]){
                temp[k]=a[i];
                k++;
                i++;
            }else{
                temp[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<n){
            temp[k]=a[i];
            k++;
            i++;
        }
        while(j<m){
            temp[k] =b[j];
            k++;
            j++;
        }

        for (int value : temp) {
            System.out.print(value + " ");
        }
    }
}
