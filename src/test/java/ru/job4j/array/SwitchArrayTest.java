package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {4, 2, 5, 1, 7};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 1, 5, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4to6() {
        int[] input = {4, 2, 5, 1, 7, 5, 1, 3};
        int source = 4;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 5, 1, 1, 5, 7, 3};
        Assert.assertArrayEquals(expected, result);
    }
}