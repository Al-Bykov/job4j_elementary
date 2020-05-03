package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int b = 0; b < board.length; b++) {
            if (board[row][b] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int a = 0; a < board.length; a++) {
            if (board[a][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}