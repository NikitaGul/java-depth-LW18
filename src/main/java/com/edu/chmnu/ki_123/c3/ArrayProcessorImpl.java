package com.edu.chmnu.ki_123.c3;

public class ArrayProcessorImpl implements
        ArrayIntProcessor{
    @Override
    public int min(int[] a) {
        int res = a[0];
        for (int i = 1; i < a.length; ++i) {
            if (a[i] < res) { res = a[i]; }
        }
        return res;
    }
    @Override
    public int max(int[] a) {
        int res = a[0];
        for (int i = 1; i < a.length; ++i) {
            if (a[i] > res) { res = a[i]; }
        }
        return res;
    }
    @Override
    public int[] filter(int[] a, IntPredicate pred) {
        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; ++i) {
            if (pred.accept(a[i])) { b[j++] = a[i]; }
        }

        if (j > 0) {
            int c[] = new int[j];
            System.arraycopy(b, 0, c, 0, j);
            return c;
        }
        else {
            return null;
        }
    }
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            int k = i;
            for (int j = k + 1; j < a.length; ++j) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            int t = a[k];
            a[k] = a[i];
            a[i] = t;
        }
    }

}
