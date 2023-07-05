package com.github.whalerain.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class ThreadExample {

    private final static String PREFIX = "ThreadCase-";

    private final static Logger log = LoggerFactory.getLogger(ThreadExample.class);

    public static void buildWithConstruction() {
        Thread thread1 = new Thread(() -> log.info("创建Thread线程：{}", Thread.currentThread().getName()), PREFIX+1);
        thread1.start();
    }


    public static void simpleBuildAndRun() {
        System.out.println("多线程执行是异步的，所以代码中的执行顺序一定不是线程执行的顺序，并且线程被调用的时机也是随机的");
        for (int i=1; i<=5; i++) {
            MyFirstThread thread = new MyFirstThread(i);
            thread.start();
            log.info("{} 执行后续代码...", thread.getName());
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread.start()执行过后，试图再次执行是非法操作！");
        MyFirstThread thread = new MyFirstThread(6);
        thread.start();
        try {
            thread.start();
        } catch (Exception e) {
            log.error("再次执行了start()方法，报错：", e);
        }

        System.out.println("代码中执行start()的顺序不代表线程启动的顺序");
        ArrayList<MyFirstThread> threads = new ArrayList<>();
        for(int i=7; i<=20; i++) {
            threads.add(new MyFirstThread(i));
        }
        for(MyFirstThread th : threads) {
            th.start();
        }

    }




}
