package prac2048.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class controller {

    private  int[][] grid = new int[4][4];
    private int M = 4;
    private int N = 4;


    public void shiftLeft(int[] arr, int from){
        for(int i=from;i<arr.length-1;i++){
            Functions.swap(arr,i,i+1);
        }
    }

    public controller(){
        this.placeTiles();
    }

    public void compressLeft(){
        for(int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                if(grid[i][j] == 0){
                    shiftLeft(grid[i],j);
                }
            }
        }
    }

    public void merge(){
        for(int i=0;i<N;i++){
            for (int j=0;j<M-1;j++){
               if(grid[i][j] == grid[i][j+1]){
                   grid[i][j] *= 2;
                   grid[i][j+1] = 0;
               }
            }
        }
    }

    public void reverse(){
        for (int i=0;i<M;i++){
            Functions.reverse(grid[i]);
        }
    }

    public void transpose(){
        for(int i=0;i<N;i++){
            for (int j=i;j<M;j++){
                int temp = grid[i][j];
                grid[i][j] = grid[j][i];
                grid[j][i] = temp;
            }
        }
    }

    public void moveLeft(){
        this.compressLeft();
        this.merge();
        this.compressLeft();
    }

    public void moveRight(){
        this.reverse();
        this.moveLeft();
        this.reverse();
    }

    public void moveUp(){
        this.transpose();
        this.moveLeft();
        this.transpose();
    }

    public void moveDown(){
        this.transpose();
        this.moveRight();
        this.transpose();
    }

    public void placeTiles(){
        if(isWon() || isGameEnd()){
            return;
        }

        Random random = new Random();
        var one = random.nextBoolean()?2:4;

        this.palceTile(one);
    }

    private void palceTile(int one) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                if(grid[i][j] == 0){
                    var al = new ArrayList<Integer>();
                    al.add(i);
                    al.add(j);
                    list.add(al);
                }
            }
        }

        Collections.shuffle(list);
        var pair = list.get(0);
        var x = pair.get(0);
        var y =pair.get(1);

        grid[x][y] = one;
    }

    public boolean isGameEnd() {
        int counnt = 0;


        for(int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                if(grid[i][j] == 0){
                    counnt++;
                }
            }
        }

        return counnt < 2;
    }

    public boolean isWon() {

        for(int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                if(grid[i][j] == 2048){
                    return true;

                }
            }
        }
        return false;
    }

    public String toString() {
        var buffer = new StringBuffer();

        for(int i = 0; i < M; ++i) {
            for(int j = 0; j < N; ++j) {
                buffer.append(grid[i][j] + " ");
            }

            buffer.append("\n");
        }

        return buffer.toString();
    }


}
