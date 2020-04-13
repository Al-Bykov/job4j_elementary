package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenS2() {
        int in1 = 6;
        int in2 = 2;
        double expected = 2;
        double out = SqArea.square(in1, in2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1ThenS1() {
        int in1 = 4;
        int in2 = 1;
        double expected = 1;
        double out = SqArea.square(in1, in2);
        Assert.assertEquals(expected, out, 0.01);
    }
}