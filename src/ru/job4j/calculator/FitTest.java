package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManHeight186ThenFit98() {
        int in = 186;
        double expected = 98.89999999999999;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight176ThenFit75() {
        int in = 176;
        double expected = 75.89999999999999;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
