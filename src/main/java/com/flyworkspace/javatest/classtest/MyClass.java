//package com.flyworkspace.javatest.classtest;
//
///**
// * 重点：内部类包含一个外部类的引用，而静态内部类没有
// * Created by jinpengfei on 17-5-12.
// */
//public class MyClass {
//
//    private int value;
//    private static int value2;
//
//    public static class InnerClass{
//        private int innerValue;
//        private static int innerValue2;  //###静态内部类可以有静态成员
//        private void test(){
//            value = 1;//***静态内部类不能访问外部类的非静态成员变量
//            value2 = 2;//***静态内部类可以访问外部类的静态成员变量
//        }
//    }
//
//    public class InnerClass2{
//        private int innerValue;
//        private static int innerValue2;  //###内部类不能有静态成员
//
//        private void test(){
//            value = 1;//***非静态内部类可以访问外部类的非静态成员变量
//            value2 = 2;//***静态内部类可以访问外部类的静态成员变量
//        }
//    }
//}
