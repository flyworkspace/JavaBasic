//package com.flyworkspace.javatest.genericity.other;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * 原文链接：http://www.linuxidc.com/Linux/2013-10/90928p4.htm
// * Created by jinpengfei on 17-5-12.
// */
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> li = Arrays.asList(1, 2, 3);
//        List<String> ls = Arrays.asList("one", "two", "three");
//
//        test1(li);  // List<Integer> 不是 List<Object> 的子类
//        test2(li);
//        test3(li);
//        test1(ls);  // List<String> 不是 List<Object> 的子类
//        test2(ls);
//        test3(ls);
//
//        List<A> list = new ArrayList<A>();
//        list.add(new A());
//        list.add(new B());
//
//        test2(list);
//        test3(list);
//    }
//
//    public static void test1(List<Object> list) {
//        for (Object elem : list)
//            System.out.println(elem + "");
//        System.out.println();
//    }
//
//    /**
//     * List<?> 表示List<? extends Object>,其可以是List<Object> , List<Animal>, List<Person>等.
//     * 在for循环时，所有对象都是Object
//     * @param list
//     */
//    public static void test2(List<?> list) {
//        for (Object elem : list)
//            System.out.println(elem.toString() + "   elem.getClass()=" + elem.getClass());
//        System.out.println();
//    }
//
//    /**
//     * List<T> 表示List中可以添加泛型数据，可以为任意类型
//     * 在for循环时，所有对象都是具体的类型，而不是Object
//     * @param list
//     * @param <T>
//     */
//    public static <T> void test3(List<T> list) {
//        for (T elem : list) {
//            System.out.println(elem.toString() + "   elem.getClass()=" + elem.getClass());
//        }
//        System.out.println();
//    }
//
//}
