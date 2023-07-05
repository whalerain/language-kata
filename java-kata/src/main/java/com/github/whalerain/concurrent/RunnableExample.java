package com.github.whalerain.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnableExample {

    private static final Logger log = LoggerFactory.getLogger(RunnableExample.class);


    public static void simpleBuildAndRun() {
        Thread thread = new Thread(new MyFirstRunnable());

        //noinspection Convert2Lambda
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });


        Thread th2 = new Thread(() -> {

        }, "");


        RunnableExample example = new RunnableExample();
        Thread th3 = new Thread(example::runCode, "");


        Thread th4 = new Thread(RunnableExample::runStaticCode, "");
    }


    private static void runStaticCode() {

    }


    private void runCode() {

    }





}
