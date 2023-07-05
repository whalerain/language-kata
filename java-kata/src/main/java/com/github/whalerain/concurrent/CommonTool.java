package com.github.whalerain.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class CommonTool {

    private static final Logger log = LoggerFactory.getLogger(CommonTool.class);
    private static final String REPORT = CommonTool.class.getName() + " report : ";

    public static void slowly() {
        try {
            TimeUnit.MILLISECONDS.sleep(1);
        } catch (InterruptedException e) {
            log.error(REPORT, e);
        }
    }


}
