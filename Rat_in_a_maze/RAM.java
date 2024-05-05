package Rat_in_a_maze;

import java.util.ArrayList;

public class RAM {

    public static void main(String[] args) {
        int[][] arr = {
                {1,0,0,0},
                {1,1,0,0},
                {1,1,0,0},
                {0,1,1,1}
        };

        int n = arr.length;

        Maze maze = new Maze();
        ArrayList<String> ans = maze.findString(arr,n);

        for (String s:ans) {
            System.out.println(s);
        }
    }
}
