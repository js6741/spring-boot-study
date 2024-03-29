package com.skcc.springboot.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(path = "/string", method = RequestMethod.GET)
    @ResponseBody
    public String getString() {
        String result = testService.getString();
        logger.debug("debug: {}", result);
        logger.info("info: {}", result);
        return result;
    }

    @RequestMapping(path = "/error", method = RequestMethod.GET)
    @ResponseBody
    public String error() {
        throw new RuntimeException("Intentionally thrown");
    }
}
