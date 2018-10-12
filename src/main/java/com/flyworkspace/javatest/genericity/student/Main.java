//package com.flyworkspace.javatest.genericity.student;
//
///**
// * 原文链接：http://www.linuxidc.com/Linux/2013-10/90928p3.htm
// * Created by jinpengfei on 17-5-12.
// */
//public class Main {
//    public static void main(String[] args) {
//        CollegeStudent[] stu = new CollegeStudent[]{
//                new CollegeStudent(3), new CollegeStudent(2),
//                new CollegeStudent(5), new CollegeStudent(4)};
//        selectionSort1(stu);
//        selectionSort2(stu);
//
//    }
//
//    /**
//     * 可以编译成功，CollegeStudent或者其父类实现了Comparable接口
//     * @param a
//     * @param <T>
//     */
//    public static <T extends Comparable<? super T>> void selectionSort1(T[] a) {
//
//    }
//
//    /**
//     * 不能编译成功：CollegeStudent没有实现Comparable接口
//     * @param a
//     * @param <T>
//     */
//    public static <T extends Comparable<T>> void selectionSort2(T[] a) {
//
//    }
//}
