package com.flyworkspace.javatest.thread.runablecallable;

import java.util.concurrent.Callable;

/**
 * Created by jinpengfei on 17-5-12.
 */
public class CallableImpl implements Callable<CallObj> {
    @Override
    public CallObj call() throws Exception {
        return new CallObj();
    }
}
