package com.flyworkspace.javatest.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinpengfei on 17-5-12.
 */
public class Main {
    public static void main(String[] args) {
//        HashMap<String, String> hashMap = new HashMap<String, String>();
//        for (int i = 0; i < 10000000; i++) {
//            String keyValue = String.valueOf(i);
//            hashMap.put(keyValue, keyValue);
//        }
//        Main main = new Main();
//        long now = System.currentTimeMillis();
//        main.Ergodic1(hashMap);
//        System.out.println("Ergodic time : " + (System.currentTimeMillis() - now) + " ms");
//        now = System.currentTimeMillis();
//        main.Ergodic2(hashMap);
//        System.out.println("Ergodic2 time : " + (System.currentTimeMillis() - now) + " ms");

        HashMap<String, String> hashMap = new HashMap<String, String>();
        String a = new String("a");
        String b = new String("a");
        String z = new String("z");
        System.out.printf((a==b)+" a.hashcode="+a.hashCode()+"   b.hashcode="+b.hashCode());
        hashMap.put("a" ,"tt");
        hashMap.put("a" ,"cc");
        hashMap.put(z ,"tt");
        System.out.println(hashMap);
    }

    private void Ergodic1(Map<String, String> paraMap) {
        for (String appFieldDefId : paraMap.keySet()) { //在for循环时，遍历所有，查找到所有的key
            String values = paraMap.get(appFieldDefId); //在get时，又会遍历所有，去查找key对应的value，若把此句去掉，则两者效率差不多
        }
    }

    private void Ergodic2(Map<String, String> paraMap) {
        for (Map.Entry<String, String> entry : paraMap.entrySet()) { //在for循环时，遍历所有，把查找到所有key和value
            //以下两句仅仅是从对象中取值，并不会循环查找，所以相对于Ergodic1，效率高很多
            String appFieldDefId = entry.getKey();
            String values = entry.getValue();
        }
    }
}
