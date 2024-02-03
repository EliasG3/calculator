package com.models;

public class ThreeInARow {

    private String[][] board;
    private String currentPlayer;
    private int moves;

    public ThreeInARow() {
        this.board = new String[3][3];
        this.currentPlayer = "X";
        this.moves = 0;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public void makeMove(int row, int col) {
        if (this.board[row][col] == null) {
            this.board[row][col] = this.currentPlayer;
            this.moves++;
            if (this.currentPlayer.equals("X")) {
                this.currentPlayer = "O";
            } else {
                this.currentPlayer = "X";
            }
        }
    }

    public String checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (this.board[i][0] != null && this.board[i][0].equals(this.board[i][1])
                    && this.board[i][0].equals(this.board[i][2])) {
                return this.board[i][0];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (this.board[0][i] != null && this.board[0][i].equals(this.board[1][i])
                    && this.board[0][i].equals(this.board[2][i])) {
                return this.board[0][i];
            }
        }
        if (this.board[0][0] != null && this.board[0][0].equals(this.board[1][1])
                && this.board[0][0].equals(this.board[2][2])) {
            return this.board[0][0];
        }
        if (this.board[0][2] != null && this.board[0][2].equals(this.board[1][1])
                && this.board[0][2].equals(this.board[2][0])) {
            return this.board[0][2];
        }
        if (this.moves == 9) {
            return "TIE";
        }else {
            return null;
        }
    }
}
