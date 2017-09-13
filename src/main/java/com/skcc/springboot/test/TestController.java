package com.skcc.springboot.test;

import org.springframework.stereotype.Component;

/**
 * @author HyunSub Shim
 * @since 1.0
 */
@Component
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    public String getString() {
        return testService.getString();
    }
}
