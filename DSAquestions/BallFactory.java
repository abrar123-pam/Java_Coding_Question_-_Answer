package DSAquestions;

import java.util.Scanner;

public class BallFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter low limit : ");
        int low = sc.nextInt();
        System.out.println("Enter high limit : ");
        int high = sc.nextInt();

        int ans = findMostBalls(low,high);
        System.out.println("Ans : "+ans);
    }

    private static int findMostBalls(int low, int high) {
        int limit = (high - low) +1;
        int[] arr = new int[limit+1];

        for (int i=low;i<=high;i++){
            int sod = digit(i);
            if(arr[sod] == 1){
                arr[sod] += 1;
            }else{
                arr[sod] = 1;
            }
        }
        int max = -1;
        for(int i=0;i<=limit;i++){

            if(arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.println();

        return max;
    }

    private static int digit(int low) {
        int sum = 0;
        while (low != 0){
            int rem = low % 10;
            sum += rem;
            low /= 10;
        }

        return sum;
    }
}
