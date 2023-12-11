package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1231, -2322, 32321, 4232, 2};
        System.out.println(Arrays.toString(swapper(array)));
    }

    public static int[] swapper(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        array[maxIndex] = minValue;
        array[minIndex] = maxValue;
        return array;
    }
}