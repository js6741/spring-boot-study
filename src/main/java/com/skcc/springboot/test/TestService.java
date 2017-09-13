package com.skcc.springboot.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author HyunSub Shim
 * @since 1.0
 */
@Service
public class TestService {

    @Value("${test.string:Default String}")
    private String string;

    public String getString() {
        return string;
    }
}
