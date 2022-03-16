package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int testResult = Factorial.calc(n);
        int expectedResult = 120;
        Assert.assertEquals(expectedResult, testResult);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int testResult = Factorial.calc(n);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, testResult);
    }
}