package org.sky.service;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-service.xml" })
public class TestRedis {
    
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    
    @Test
    public void test() throws InterruptedException {
        redisTemplate.opsForValue().set("foo", "bar", 10, TimeUnit.SECONDS);
        System.out.println("foo: " + redisTemplate.opsForValue().get("foo"));
        Thread.sleep(10000);
        System.out.println("foo: " + redisTemplate.opsForValue().get("foo"));
    }

}