package org.sky.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sky.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-service.xml" })
public class TestService {
    
    @Autowired
    private UserService userService;
    
    @Test
    public void test1() throws Exception {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    userService.test();
                }
            }).start();
        }
    }
    
}
