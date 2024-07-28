package DSAquestions;

import java.util.ArrayList;

public class ratInMaze {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        int n = arr.length;
        int[][] visited = new int[arr[0].length][n];
        int[] dx = {1,0,0,-1};
        int[] dy = {0,-1,1,0};
        ArrayList<String> list = new ArrayList<>();
//        if(arr[0][0] == 1)
//            solve(0,0,arr,list,n,"",visited,dx,dy);
        if(arr[0][0] == 1)
             findExit(0,0,arr,list,n,"",visited);

        for (String s : list){
            System.out.println(s);
        }
    }

    private static void solve(int i, int j, int[][] arr, ArrayList<String> list, int n, String s, int[][] visited, int[] dx, int[] dy) {
        if(i == n-1 && j== n-1){
            list.add(s);
            return;
        }

        String sb = "DLRU";

        for(int idx=0;idx<dx.length;idx++){
            int nexti = i+dx[idx];
            int nextj = j+dy[idx];
            if(nexti <n && nextj >=0 && nexti >=0 && nextj <n && arr[nexti][nextj] == 1 && visited[nexti][nextj] == 0){
                visited[nexti][nextj] = 1;
                solve(nexti,nextj,arr,list,n,s+sb.charAt(idx),visited,dx,dy);
                visited[nexti][nextj] = 0;

            }
        }


    }

    public static void findExit(int i, int j,int[][] arr,ArrayList<String> list,int n ,String s,int[][] visited){

        if(i == n-1 && j == n-1){
            list.add(s);
            return;
        }
        //Down
        if(i+1 <n && arr[i+1][j] == 1 && visited[i+1][j] == 0 ){
            visited[i+1][j] = 1;
            findExit(i+1,j,arr,list,n,s+"D",visited);
            visited[i+1][j] = 0;
        }

        //left
        if(j-1>=0 && visited[i][j-1] == 0 && arr[i][j-1] == 1){
            visited[i][j-1]= 1;
            findExit(i,j-1,arr,list,n,s+"L",visited);
            visited[i][j-1] = 0;
        }

        //right
        if(j+1<n && visited[i][j+1] == 0 && arr[i][j+1] == 1) {
            visited[i][j + 1] = 1;
            findExit(i, j + 1, arr,list, n, s + "R", visited);
            visited[i][j + 1] = 0;
        }

        //up
        if(i-1 >= 0 && visited[i-1][j]==0 && arr[i-1][j] == 1){
            visited[i-1][j] = 1;
            findExit(i-1,j,arr,list,n,s+"U",visited);
            visited[i-1][j] = 0;
        }

    }


}
