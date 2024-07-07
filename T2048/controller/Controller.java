package T2048.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import Serialization.Models.Student;
import T2048.utility.Functions;

public class Controller {
    private int[][] grid = new int[4][4];
    private int M = 4;
    private int N = 4;

    private void shiftLeft(int[] arr, int from) {
        for(int i = from; i < arr.length - 1; ++i) {
            Functions.swap(arr, i, i + 1);
        }
    }

    private void compressLeft() {
        for(int i = 0; i < M; ++i) {
            for(int j = 0; j < N; ++j) {
                if(grid[i][j] == 0) {
                    shiftLeft(grid[i], j);
                }
            }
        }
    }

    private void merge() {
        for(int i = 0; i < M; ++i) {
            for(int j = 0; j < N - 1; ++j) {
                if(grid[i][j] == grid[i][j+1]) {
                    grid[i][j] *= 2;
                    grid[i][j+1] = 0;
                }
            }
        }
    }

    private void reverse() {
        for(int i = 0; i < M; ++i) {
            Functions.reverse(grid[i]);
        }
    }

    private void transpose() {
        for(int i = 0; i < M; ++i) {
            for(int j = i; j < N; ++j) {
                int temp = grid[i][j];
                grid[i][j] = grid[j][i];
                grid[j][i] = temp;
            }
        }
    }

    private void placeTile(int num) {
        var list = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < M; ++i) {
            for(int j = 0; j < N; ++j) {
                if(grid[i][j] == 0) {
                    var pair = new ArrayList<Integer>();
                    pair.add(i);
                    pair.add(j);
                    list.add(pair);
                }
            }
        }

        Collections.shuffle(list);
        var pair = list.get(0);
        var x = pair.get(0);
        var y = pair.get(1);
        grid[x][y] = num;
    }

    public Controller() {
        this.placeTiles();
    }

    public boolean isGameOver() {
        int freeCount = 0;

        for(int i = 0; i < M; ++i) {
            for(int j = 0; j < N; ++j) {
                if(grid[i][j] == 0) {
                    freeCount++;
                }
            }
        }
        return freeCount < 2;
    }

    public boolean isWon() {
        for(int i = 0; i < M; ++i) {
            for(int j = 0; j < N; ++j) {
                if(grid[i][j] == 2048) {
                    return true;
                }
            }
        }

        return false;
    }

    public void moveLeft() {
        this.compressLeft();
        this.merge();
        this.compressLeft();
    }

    public void moveRight() {
        this.reverse();
        this.moveLeft();
        this.reverse();
    }

    public void moveUp() {
        this.transpose();
        this.moveLeft();
        this.transpose();
    }

    public void moveDown() {
        this.transpose();
        this.moveRight();
        this.transpose();
    }

    public void placeTiles() {
        if(isWon() || isGameOver()) {
            throw new IllegalStateException("Game is End");
        }

        var random = new Random();
        var one = random.nextBoolean() ? 2 : 4;
        var two = random.nextBoolean() ? 2 : 4;
        this.placeTile(one);
        this.placeTile(two);
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