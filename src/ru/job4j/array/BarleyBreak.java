package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array.length; b++) {
                System.out.print(array[a][b] + " ");
            }
        }
    }
}