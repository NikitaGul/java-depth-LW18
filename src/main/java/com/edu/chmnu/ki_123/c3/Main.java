package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int a[] = {-1, 4, -5, 6, 3, 0, 9, 5, -7, 0, -3};
        ArrayIntProcessor proc = new ArrayProcessorImpl();
        System.out.println("Min: " + proc.min(a));
        System.out.println("Max: " + proc.max(a));

        System.out.println("Before: " + Arrays.toString(a));
        proc.sort(a);
        System.out.println("After: " + Arrays.toString(a));

        int[] posNums = proc.filter(a, i -> i > 0);
        System.out.println("+: " + Arrays.toString(posNums));

        int[] negNums = proc.filter(a, i -> i < 0);
        System.out.println("-: " + Arrays.toString(negNums));

        int[] gt10Nums = proc.filter(a, i -> i > 10);
        System.out.println(">10: " + Arrays.toString(gt10Nums));

        ArrayProcessorDouble processor = new ArrayProcessorDouble();

        double[] array = {5.5, -2.3, 9.1, 0.0, -8.8, 3.3};

        System.out.println("Min: " + processor.min(array));


        System.out.println("Max: " + processor.max(array));

        double[] filtered = processor.filter(array, value -> value > 0);
        System.out.print("Filtered: ");
        System.out.println("+: " + Arrays.toString(filtered));
        System.out.println();

        processor.sort(array);
        System.out.print("Sorted: ");
        System.out.println("+: " + Arrays.toString(array));

        BothArrayProcessor processor1 = new BothArrayProcessor();

        int[] intArray = {5, -2, 9, 0, -8, 3};
        System.out.println("Int Min: " + processor1.min(intArray));
        System.out.println("Int Max: " + processor1.max(intArray));
        System.out.println("Int Filtered (>0): " + Arrays.toString(processor1.filter(intArray, value -> value > 0)));
        processor1.sort(intArray);
        System.out.println("Int Sorted: " + Arrays.toString(intArray));

        double[] doubleArray = {5.5, -2.3, 9.1, 0.0, -8.8, 3.3};
        System.out.println("Double Min: " + processor1.min(doubleArray));
        System.out.println("Double Max: " + processor1.max(doubleArray));
        System.out.println("Double Filtered (>0): " + Arrays.toString(processor1.filter(doubleArray, value -> value > 0)));
        processor1.sort(doubleArray);
        System.out.println("Double Sorted: " + Arrays.toString(doubleArray));
    }
}