package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5() {
        int[] input = new int[]{24, 12, 146, 3, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{0, 3, 12, 24, 146};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[]{24, 146, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{0, 24, 146};
        assertThat(result, is(expect));
    }
}