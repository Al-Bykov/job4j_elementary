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
}