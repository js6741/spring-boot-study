package com.skcc.springboot.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author HyunSub Shim
 * @since 1.0
 */
@Service
@Profile("s1")
public class TestService1 implements TestService {

    @Value("${test.string:Default String}")
    private String string;

    @Override
    public String getString() {
        return string;
    }
}
