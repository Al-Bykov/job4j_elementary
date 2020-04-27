package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas20Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {10, 20, 30};
        int value = 20;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 3, 5, 7, 9};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNo33ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {15, 28, 74, 92, 126};
        int value = 33;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}