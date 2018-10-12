package com.flyworkspace.javatest.genericity.animal;

import java.util.List;

/**
 * Created by jinpengfei on 17-5-12.
 */
public class AnimalTrainer {
    /**
     * 若为此方法时，GenericityMain无法编译成功
     * @param list
     */
    public void act(List<Animal> list) {   //因为AnimalTrainer已经指明泛型类型为Animal.Cat虽然为Animal的子类，但不是Animal,所以不能传入。参数为List<Animal> list，只能传入List<Animal>
        for (Animal animal : list) {
            animal.eat();
        }
    }

//    /**
//     * 修改为此方法后，可以编译成功，灵活性增强
//     * @param list
//     */
//    public void act(List<? extends Animal> list) {    //参数为List<? extends Animal>，可以传入List<Cat> ,List<Animal>, List<Magpie>等参数
//        for (Animal animal : list) {
//            animal.eat();
//        }
//    }
}