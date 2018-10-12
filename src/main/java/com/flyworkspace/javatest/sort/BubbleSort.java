package com.flyworkspace.javatest.sort;

/**
 * 冒泡排序
 * Created by jinpengfei on 17-5-11.
 */
public class BubbleSort extends Sort {
    private static final boolean ENABLE_LOG = false || Sort.ENABLE_ALL_LOG;

    @Override
    public void sort(int[] origin) {
            bubbleSort(origin);
    }

    private void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (ENABLE_LOG) {
                System.out.print("  i=" + i + ":  ");
                for (int k : array) {
                    System.out.print(+k + " ");
                }
                System.out.println();
            }
        }
    }
}
