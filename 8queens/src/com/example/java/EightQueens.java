package com.example.java;

public class EightQueens {
    public EightQueens() {
       EightQueensm();
    }

    public static void EightQueensm() {
        //Can put scanner in here to allow user to input their own queens
        int nQueens = 8;

        //innit array

        int[] board = new int[nQueens];
        for (int i = 0; i < board.length; i++) {
            board[i] = -1;
        }


        int currentRow = 0;
        board[currentRow] = 0;
        currentRow++;
        int currentColumn = 0;
        long solutions = 0;
        while (currentRow >= 0) {
            if (isValid(currentRow, currentColumn, board)) {
                board[currentRow] =currentColumn;
                currentRow++;
                currentColumn = 0;


                //Board complete
                if (currentRow >= board.length) {
                    solutions++;
                    System.out.println("solution" + solutions);
                    printBoard(board);
                    currentRow--;
                    currentColumn = board[currentRow] + 1;
                }
            }else{
                //if board is not valid
                currentColumn++;
                if (currentColumn >= board.length) {
                    board[currentRow] = -1;
                    if(currentRow >= 0)
                        currentColumn = board[currentRow] + 1;
                }

            }

        }
        System.out.println("Nums of solus " + nQueens+ " queen is");
    }
    public static boolean isValid(int currentRow, int currentColumn, int[]board) {
        if (currentColumn >= board.length)
            return false;
        for (int i = 0; i < currentRow; i++) {
            //check column and row
            if (board[i] == currentColumn)
                return false;
            if (Math.abs(currentRow - i)== Math.abs(currentColumn - board[i]))
                return false;
        }
        return true;
    }

    public static void printBoard(int[] board) {
        //printable board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i] ==j)
                    System.out.print("|Q");
                else
                    System.out.print("| ");
            }
            System.out.println(" |");
        }

    }

}
