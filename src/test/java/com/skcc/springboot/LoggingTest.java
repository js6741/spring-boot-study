package com.skcc.springboot;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author HyunSub Shim
 * @since 1.0
 */
public class LoggingTest {

    private final Logger logger = LoggerFactory.getLogger(LoggingTest.class);

    @Test
    public void test() {
        logger.debug("debug log");
        logger.info("info log");
    }
}
