package com.github.whalerain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("my first junit5 test")
class MyFirstJUnit5Test {

    private final Logger log = LoggerFactory.getLogger(MyFirstJUnit5Test.class);

    @Test
    @DisplayName("the first test")
    void testJunit5() {
        int way = 1;
        assertEquals(1, way);
        System.out.println("first test is passed");
        log.info("test slf4j ...");
    }

    @Test
    @DisplayName("test disabled")
    @Disabled("bug #20165 修复后重新打开")
    void testWillBeSkipped() {
        System.out.println("if print this, you need to check your @Disabled method");
    }

    @RepeatedTest(value = 10)
    void testRepeated() {

    }



}
