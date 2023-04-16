package Recursion;

import java.util.Arrays;

public class NQueen {
    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };

        if(!solveNQ(board, 0, board.length)){
            System.out.println("Solution does not exist");
        }
        printSolution(board);
    }

    static void printSolution(int[][] board){
        for(int i=0; i<board.length; i++){
            for(int j =0; j<board.length; j++){
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean solveNQ(int[][] board, int col, int len){
        // Base condition to check if all queens are placed in the board or not
        if(col >= len) return true;

        // Consider the present col and try placing the queens in all the other rows
        for(int i = 0; i<len; i++){
            // Check if the queen can be placed in current row
            if(isSafe(board, i, col)){
                board[i][col] = 1;
                if(solveNQ(board, col + 1, len)) return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col){
        int i,j;
        // check the current row on the left side
        for(i = 0; i<col; i++){
            if(board[row][i] == 1){
                return false;
            }
        }

        // Check Upper diagonal on left side
        for(i = row, j = col; i>=0 && j>= 0; i--, j--){
            if(board[i][j] == 1) return false;
        }

        // Check Lower diagonal on left side
        for(i = row, j= col; i<board.length && j>=0 ; i++, j--){
            if(board[i][j] == 1) return false;
        }
        return true;
    }
}
