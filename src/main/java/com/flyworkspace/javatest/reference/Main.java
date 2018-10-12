package com.flyworkspace.javatest.reference;

import com.flyworkspace.javatest.SimpleTest;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * Created by jinpengfei on 17-5-24.
 */
public class Main {
    public static void main(String[] args) {
        Main a = new Main();

        ReferenceQueue queue = new ReferenceQueue();
        WeakReference aa = new WeakReference(a, queue);

        a = null;    // 把本行注释掉，a是强引用，最后没有输出

        Runtime.getRuntime().gc();
        System.runFinalization();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Reference poll;
        while ((poll = queue.poll()) != null) {
            System.out.println(poll.toString());
        }
    }
}
