package com.skcc.springboot.test;

import org.springframework.stereotype.Service;

/**
 * @author HyunSub Shim
 * @since 1.0
 */
@Service
public class TestService2 implements TestService {

    @Override
    public String getString() {
        return "TestService2 String";
    }
}