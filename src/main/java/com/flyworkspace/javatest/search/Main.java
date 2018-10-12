package com.flyworkspace.javatest.search;

/**
 * Created by jinpengfei on 17-5-12.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 13, 87, 431, 670, 4544, 4544, 4544, 13421, 14220, 57316, 70005, 441500};
        System.out.println(biSearch(array, 4544));
        System.out.println(sort(array, 4544));
        System.out.println(biSearchFirst(array, 4544));
        System.out.println(biSearchLast(array, 4544));
    }

    /**
     * 折半查找
     * @param array
     * @param a
     * @return
     */
    public static int biSearch(int[] array, int a) {
        int start = 0;   //从start开始
        int end = array.length - 1;//到end结束
        int mid;//中间的位置
        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] == a) {
                return mid + 1;
            } else if (array[mid] < a) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int sort(int[] array, int a) {
        return sort(array, a, 0, array.length - 1);
    }

    /**
     * 折半查找，递归方式
     * @param array
     * @param a
     * @param start
     * @param end
     * @return
     */
    public static int sort(int[] array, int a, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (a == array[mid]) {
                return mid + 1;
            } else if (a > array[mid]) {
                return sort(array, a, mid + 1, end);
            } else {
                return sort(array, a, start, mid - 1);
            }
        }
        return -1;
    }

    /**
     * 折半查找，寻找第一个
     * @param array
     * @param a
     * @return
     */
    public static int biSearchFirst(int[] array, int a) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (array[mid] < a) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (array[start] != a) {
            return -1;
        } else {
            return start;
        }
    }

    /**
     * 折半查找，寻找最后一个
     * @param array
     * @param a
     * @return
     */
    public static int biSearchLast(int[] array, int a) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start < end) {
            mid = (start + end + 1) / 2;
            if (array[mid] <= a) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }

        if (array[start] != a) {
            return -1;
        } else {
            return end;
        }
    }
}
