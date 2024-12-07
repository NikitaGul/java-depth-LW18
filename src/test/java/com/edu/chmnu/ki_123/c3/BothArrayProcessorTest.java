package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class BothArrayProcessorTest {

    private BothArrayProcessor processor;

    @BeforeEach
    public void setUp() {
        processor = new BothArrayProcessor();
    }

    @Test
    public void testMin() {
        double[] array = {5.5, -2.3, 9.1, 0.0, -8.8, 3.3};
        double result = processor.min(array);
        assertEquals(-8.8, result);
    }

    @Test
    public void testMax() {
        double[] array = {5.5, -2.3, 9.1, 0.0, -8.8, 3.3};
        double result = processor.max(array);
        assertEquals(9.1, result);
    }

    @Test
    public void testFilter() {
        double[] array = {5.5, -2.3, 9.1, 0.0, -8.8, 3.3};
        double[] result = processor.filter(array, value -> value > 0);
        double[] expected = {5.5, 9.1, 3.3};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSort() {
        double[] array = {5.5, -2.3, 9.1, 0.0, -8.8, 3.3};
        processor.sort(array);
        double[] expected = {-8.8, -2.3, 0.0, 3.3, 5.5, 9.1};
        assertArrayEquals(expected, array);
    }

    @Test
    public void testFilterEmptyArray() {
        double[] array = {};
        double[] result = processor.filter(array, value -> value > 0);
        assertArrayEquals(new double[]{}, result);
    }

    @Test
    public void testFilterZeroValue() {
        double[] array = {0.0, 0.0, 0.0};
        double[] result = processor.filter(array, value -> value == 0);
        assertArrayEquals(array, result);
    }
}
