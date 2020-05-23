package ru.job4j.sort;

import java.util.Arrays;

public class MergeThree {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, a = 0, b = 0;
        while (i < rsl.length) {
            rsl[i] = left[a];
            a++;
            if (left[a] > right[b]) {
                rsl[i] = right[b];
                b++;
            }
            i++;
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