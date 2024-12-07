package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class BothArrayProcessor implements  ArrayIntProcessor, ArrayDoubleProcessor {
    @Override
    public int min(int[] a) {
        return Arrays.stream(a).min().orElseThrow();
    }

    @Override
    public int max(int[] a) {
        return Arrays.stream(a).max().orElseThrow();
    }

    @Override
    public int[] filter(int[] a, IntPredicate pred) {
        int[] temp = new int[a.length];
        int count = 0;
        for (int value : a) {
            if (pred.accept(value)) {
                temp[count++] = value;
            }
        }
        return Arrays.copyOf(temp, count);
    }

    @Override
    public void sort(int[] a) {
        Arrays.sort(a);
    }

    @Override
    public double min(double[] a) {
        return Arrays.stream(a).min().orElseThrow();
    }

    @Override
    public double max(double[] a) {
        return Arrays.stream(a).max().orElseThrow();
    }

    @Override
    public double[] filter(double[] a, DoublePredicate pred) {
        double[] temp = new double[a.length];
        int count = 0;
        for (double value : a) {
            if (pred.accept(value)) {
                temp[count++] = value;
            }
        }
        return Arrays.copyOf(temp, count);
    }


    @Override
    public void sort(double[] a) {
        Arrays.sort(a);
    }
}
