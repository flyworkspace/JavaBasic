package com.flyworkspace.javatest.trycatch;

/**
 * try catch final 中return 的返回情况
 * 总结：return中的运算后的值记录在存储器
 *      1.若没有遇到新的return，则返回原值，无论值如何改变
 *      2.若遇到新的return（final中有return），则返回新值
 * Created by jinpengfei on 17-5-9.
 */
public class TryCatchTest {
    public static void main(String[] args) {
        System.out.println(exceptionTest());
        System.out.println(exceptionTest1());
        System.out.println(exceptionTest2());
        System.out.println(exceptionTest3());
    }

    /**
     * try中return，无exception ，final改变原值
     *
     * @return
     */
    private static int exceptionTest() {
        int a = 0;
        try {
            a = 1;
//            int c = a/0;
            return ++a;
        } catch (Exception e) {
            e.printStackTrace();
            return a += 100;
        } finally {
            a = a + 10;
//            return a +  1000;
        }
    }

    /**
     * try中return，无exception ，final改变原值并return
     *
     * @return
     */
    private static int exceptionTest1() {
        int a = 0;
        try {
            a = 1;
//            int c = a/0;
            return ++a;
        } catch (Exception e) {
            e.printStackTrace();
            return a += 100;
        } finally {
            a = a + 10;
            return a += 1000;
        }
    }

    /**
     * try中return，有exception并return ，final改变原值
     *
     * @return
     */
    private static int exceptionTest2() {
        int a = 0;
        try {
            a = 1;
            int c = a / 0;
            return ++a;
        } catch (Exception e) {
            e.printStackTrace();
            return a += 100;
        } finally {
            a = a + 10;
//            return a + 1000;
        }
    }

    /**
     * try中return，有exception并return ，final改变原值并return
     *
     * @return
     */
    private static int exceptionTest3() {
        int a = 0;
        try {
            a = 1;
            int c = a / 0;
            return ++a;
        } catch (Exception e) {
            e.printStackTrace();
            return a += 100;
        } finally {
            a = a + 10;
            return a += 1000;
        }
    }
}
