package com.flyworkspace.javatest.genericity.animal;

/**
 * Created by jinpengfei on 17-5-12.
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(getName() + " can eat.");
    }

    public String getName(){
        return name;
    }
}
