package com.edu.chmnu.ki_123.c3;

public interface ArrayDoubleProcessor {
    double min(double[] a);
    double max(double[] a);
    double[] filter(double[] a, DoublePredicate pred);
    void sort(double[] a);
}
