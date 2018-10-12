package com.flyworkspace.javatest.genericity.animal;

/**
 * Created by jinpengfei on 17-5-12.
 */
public class Magpie extends Bird {

    public Magpie(String name) {
        super(name);
    }

    public void sing(){
        System.out.println(getName() +
                " can not only eat,but sing");
    }
}