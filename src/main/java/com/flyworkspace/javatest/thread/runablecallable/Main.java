package com.flyworkspace.javatest.thread.runablecallable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by jinpengfei on 17-5-12.
 */
public class Main {
    public static void main(String[] args) {
        Runnable runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();

        Callable<CallObj> callable = new CallableImpl();
        FutureTask<CallObj> future = new FutureTask<CallObj>(callable){
            @Override
            public boolean isDone() {
                return super.isDone();
            }
        };
        Thread thread1 = new Thread(future);
        thread1.start();

        Thread thread2 = new Thread(runnableTest());
        thread2.start();
    }

    private static Runnable runnableTest(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                byte[] a =new byte[0];
                synchronized (a) {
                    try {
                        a.wait(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        return runnable;
    }
}
