package com.flyworkspace.javatest.genericity.animal;

/**
 * Created by jinpengfei on 17-5-12.
 */
public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(getName() + " can fly.");
    }
}