package com.skcc.springboot.test;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author HyunSub Shim
 * @since 1.0
 */
@Service
@Profile("s2")
public class TestService2 implements TestService {

    @Override
    public String getString() {
        return "TestService2 String";
    }
}
