package DSAquestions;

public class TheMazeIII {
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
        int n = arr.length;
        int[] st = {0,4};
        int[] end = {4,4};
        int[][] visited = new int[arr[0].length][n];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<n;j++){
                visited[i][j] = 0;
            }
        }
        String s = "";
        findMinimumDistance(st[0],st[1],end[0],end[1],arr,n,visited,s);

    }

    private static void findMinimumDistance(int i, int j, int i2, int i3, int[][] arr, int n,int[][] visited,String s) {
        if(i==i2 && j==i3){
            System.out.println(s.length());
            return;
        }
        //Down
        if(i+1 < n && visited[i+1][j] !=-1 && arr[i+1][j]==0){
            visited[i+1][j] = -1;
            findMinimumDistance(i+1,j,i2,i3,arr,n,visited,s+"D");
            visited[i+1][j] = 0;
        }

        //Left
        if(j-1 >= 0 && visited[i][j-1] !=-1 && arr[i][j-1]==0){
            visited[i][j-1] = -1;
            findMinimumDistance(i,j-2,i2,i3,arr,n,visited,s+"L");
            visited[i][j-1] = 0;
        }
        //Right
        if(j+1< n && visited[i][j+1] !=-1 && arr[i][j+1]==0){
            visited[i][j+1] = -1;
            findMinimumDistance(i,j+1,i2,i3,arr,n,visited,s+"R");
            visited[i][j+1] = 0;
        }

        //Up
        if(i-1 >=0 && visited[i-1][j] !=-1 && arr[i-1][j]==0){
            visited[i-1][j] = -1;
            findMinimumDistance(i-1,j,i2,i3,arr,n,visited,s+"L");
            visited[i-j][j] = 0;
        }
    }
}
