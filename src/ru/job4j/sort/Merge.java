package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, a = 0, b = 0;

        //Этот цикл работат до тех пор, пока в одном из масивов не остаются ячейчки с индексами,
        // которых нет во втором массиве.
        while (a < left.length && b < right.length) {
            if (left[a] < right[b]) {
                rsl[i] = left[a];
                a++;
            } else {
                rsl[i] = right[b];
                b++;
            }
            i++;
        }
        //Этот цикл срабатывает, если массив left длиннее, чем массив right.
        while (a < left.length) {
            rsl[i] = left[a];
            i++;
            a++;
        }
        //Этот цикл срабатывает, если массив right длиннее, чем массив left.
        while (b < right.length) {
            rsl[i] = right[b];
            i++;
            b++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}