package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int a = 0; a < table.length; a++) {
            for (int b = 0; b < table.length; b++) {
                table[a][b] = (a + 1) * (b + 1);
            }
        }
        return table;
    }
}