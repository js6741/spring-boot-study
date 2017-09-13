package com.skcc.springboot.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HyunSub Shim
 * @since 1.0
 */
@Controller
@RequestMapping(path = "/test")
public class TestController {

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(path = "/string", method = RequestMethod.GET)
    @ResponseBody
    public String getString() {
        return testService.getString();
    }
}
