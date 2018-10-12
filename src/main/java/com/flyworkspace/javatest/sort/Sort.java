package com.flyworkspace.javatest.sort;

/**
 * Created by jinpengfei on 17-5-11.
 */
public abstract class Sort {
    protected static boolean ENABLE_ALL_LOG = true;

    protected abstract void sort(int[] origin);

    public void doSort(int[] origin) {
        if (origin != null && origin.length > 1) {
            System.out.println(getClass().getSimpleName() + " start...");
            sort(origin);
        }
        printResult(origin);
    }

    protected void printResult(int[] array) {
        System.out.println(getClass().getSimpleName() + " result:");
        for (int i : array) {
            System.out.print(i + "   ");
        }
    }
}
