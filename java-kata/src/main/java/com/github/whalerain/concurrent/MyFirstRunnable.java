package com.github.whalerain.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFirstRunnable implements Runnable {

    private static final Logger log = LoggerFactory.getLogger(MyFirstRunnable.class);

    @Override
    public void run() {
        log.info("my first runnable is running ...");
    }
}
