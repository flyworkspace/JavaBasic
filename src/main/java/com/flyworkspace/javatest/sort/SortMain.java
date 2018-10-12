package com.flyworkspace.javatest.sort;

import com.flyworkspace.javatest.sort.BubbleSort;
import com.flyworkspace.javatest.sort.Sort;

/**
 * Created by jinpengfei on 17-5-11.
 */
public class SortMain {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 1, 87, 4, 67, 45, 134, 0, 57, -5, 44};
//        Sort quickSort = new QuickSort();
//        quickSort.doSort(array);
//        for (int i : array) {
//            System.out.println("Quick sort result:" + i);
//        }

        Sort bubbleSort = new BubbleSort();
        bubbleSort.doSort(array);
    }
}
