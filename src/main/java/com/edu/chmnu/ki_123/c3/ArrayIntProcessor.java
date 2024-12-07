package com.edu.chmnu.ki_123.c3;

import java.util.function.Predicate;

public interface ArrayIntProcessor {
    int min(int[] a);
    int max(int[] a);
    int[] filter(int[] a, IntPredicate pred);
    void sort(int[] a);
}
