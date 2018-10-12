//package com.flyworkspace.javatest.genericity.animal;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * 原文链接：http://www.linuxidc.com/Linux/2013-10/90928.htm
// * Created by jinpengfei on 17-5-12.
// */
//public class Main {
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.test1();
//    }
//
//    private void test1(){
//        AnimalTrainer animalTrainer = new AnimalTrainer();
//        //Test 1
//        List<Animal> animalList = new ArrayList<Animal>();
//        animalList.add(new Cat("cat1"));
//        animalList.add(new Bird("bird1"));
//
//        animalTrainer.act(animalList);    //可以通过编译，泛型的基础用法
//
//        //Test 2
//        List<Cat> catList = new ArrayList<Cat>();
//        catList.add(new Cat("cat2"));
//        catList.add(new Cat("cat3"));
//        animalTrainer.act(catList);        //无法通过编译，具体请进入act方法查看原因
//    }
//
//    /**
//     *
//     *以下不能编译成功，list类型为List<? extends Animal>，其代表不确定类型，
//     *有可能是List<Cat> ,List<Animal>, List<Magpie> 中的任意一种类型，
//     *所以下面传入Animal和bird和cat都不行，不确定到底什么类型,故不能编译成功
//     * @param list
//     */
//    private void test2(List<? extends Animal> list){
//        list.add(new Animal("animal"));
//        list.add(new Bird("bird"));
//        list.add(new Cat("cat"));
//    }
//
//    /**
//     * 以下可以编译成功，list类型为List<? extends Bird>，其代表不确定类型，
//     * 有可能是List<Bird>， List<Animal>, List<Object> 中任意一种类型，
//     * 传入Bird或者Magpie都可以，应为无论Bird或者Magpie都是bird或者Animal的子类，不会有问题
//     * @param list
//     */
//    public void test3(List<? super Bird> list){
//        //以下可以add所有Bird及其子类
//        list.add(new Bird("bird"));
//        list.add(new Magpie("magpie"));
//    }
//
//    /**
//     * 和test3类似，不能add animal的原因是：
//     * list存在是List<Bird>的可以能（如test3中描述），而Animal不是Bird，会有错误，所以不能编译
//     * @param list
//     */
//    public void test4(List<? super Bird> list){
//        //以下可以add所有Bird及其子类
//        list.add(new Bird("bird"));
//        list.add(new Magpie("magpie"));
//        list.add(new Animal("animal"));
//    }
//
//    /**
//     * 对于通配符类型的for循环
//     */
//    public void test5(){
//        List<? extends Animal> list1 = new ArrayList<Animal>();
//        for (Animal animal: list1){   //list1中所有都是Animal的子类，所以可以使用所有Animal及其父类进行遍历
//
//        }
//        for (Object obj: list1){   //list1中所有都是Animal的子类，所以可以使用所有Animal及其父类进行遍历，Object是Animal的父类
//
//        }
//        for (Bird bird: list1){//list1中所有都是Animal的子类，所以可以使用所有Animal及其父类进行遍历,bird不是Animal的父类
//
//        }
//
//        //******************************************××××××
//
//        List<? super Bird> list2 = new ArrayList<Bird>();
//        for (Bird bird : list2){
//            // list2有可能是List<Bird>， List<Animal>, List<Object> 中任意一种类型，
//            // 当list2为List<Animal>的时候，本例出错，故不能编译成功
//        }
//
//        for (Animal animal: list2){
//            // 原因同上，
//            // 当list2为List<Object>的时候，本例出错，故不能编译成功
//        }
//
//        for (Object obj: list2){
//            // list2有可能是List<Bird>， List<Animal>, List<Object> 中任意一种类型，
//            // Object包含了上述所有类型，所以可以编译成功
//        }
//    }
//}
