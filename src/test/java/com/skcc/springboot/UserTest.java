package com.skcc.springboot;

import com.skcc.springboot.user.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

/**
 * @author HyunSub Shim
 * @since 1.0
 */
public class UserTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test() {

        User user = new User(0, "Shim", 37);

        logger.debug("{}", user);

    }

    @Test
    public void equalsTest() {
        User user1 = new User(0, "Shim", 37);
        User user2 = new User(0, "Shim", 37);
        User user3 = new User(1, "Shim", 37);

        assertThat(user1, is(user2));

        assertThat(user2, is(not(user3)));

    }
}
