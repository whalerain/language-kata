package com.github.whalerain.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFirstThread extends Thread {

    private static final Logger log = LoggerFactory.getLogger(MyFirstThread.class);

    private int index;

    public MyFirstThread(int index) {
        super();
        this.index = index;
    }

    @Override
    public void run() {
        super.run();
        log.info("{} run my first thread for index : {}, it's great !", this.getName(), this.index);
    }
}
