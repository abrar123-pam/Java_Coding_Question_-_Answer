package Rat_in_a_maze;

import java.util.ArrayList;

public class Maze {

    public static void solve(int i,int j,int[][] maze,StringBuilder temp,ArrayList<String> result){
        int n = maze.length;
        if(!(i>=0 && i<n && j>=0 && j<n && maze[i][j] != 0)){
            return;
        }

        if(i == n-1 && j == n-1){
            result.add(temp.toString());
            return;
        }

        maze[i][j] = 0;

        temp.append('D');
        solve(i+1,j,maze,temp,result);
        temp.deleteCharAt(temp.length()-1);

        temp.append('R');
        solve(i,j+1,maze,temp,result);
        temp.deleteCharAt(temp.length()-1);

        temp.append('U');
        solve(i-1,j,maze,temp,result);
        temp.deleteCharAt(temp.length()-1);

        temp.append('L');
        solve(i,j-1,maze,temp,result);
        temp.deleteCharAt(temp.length()-1);


        maze[i][j] = 1;
    }

    public ArrayList<String> findString(int[][] maze,int n){

        ArrayList<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        solve(0,0,maze,temp,result);

        return  result;
    }
}
