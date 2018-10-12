package com.flyworkspace.javatest;

/**
 * Created by jinpengfei on 17-5-11.
 */
public class SimpleTest {
    public static void main(String[] args) {
        int a = 0xA << 1;
        System.out.println("" + a);
        float b = 1.1f;
        System.out.println(1 + b);
        String aaa = "bb";
        ClassLoader classLoader = SimpleTest.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(String.class.getClassLoader());
        System.out.println(Math.class.getClassLoader());
        System.out.println(new SimpleTest().test(9923));
    }

    private String test(int count){
        if (count == 0){
            return "hello";
        }
        return test(--count);
    }
}
