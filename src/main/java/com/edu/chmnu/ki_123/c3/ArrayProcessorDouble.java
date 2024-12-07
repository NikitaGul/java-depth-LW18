package com.edu.chmnu.ki_123.c3;

public class ArrayProcessorDouble implements ArrayDoubleProcessor{
    @Override
    public double min(double[] a) {
        double res = a[0];
        for (int i = 1; i < a.length; ++i) {
            if (a[i] < res) {
                res = a[i];
            }
        }
        return res;
    }

    @Override
    public double max(double[] a) {
        double res = a[0];
        for (int i = 1; i < a.length; ++i) {
            if (a[i] > res) {
                res = a[i];
            }
        }
        return res;
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
        double[] result = new double[count];
        System.arraycopy(temp, 0, result, 0, count);
        return result;
    }

    @Override
    public void sort(double[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; ++j) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }
    }
}
