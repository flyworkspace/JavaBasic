package com.flyworkspace.javatest.genericity.animal;

/**
 * Created by jinpengfei on 17-5-12.
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void jump(){
        System.out.println(getName() + " can jump.");
    }
}