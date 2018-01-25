package org.sky.service;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-service.xml" })
public class TestMongoDB {
    
    @Autowired
    protected MongoTemplate mongoTemplate;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    
    @Test
    public void test() {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is("tom"));
        User user = mongoTemplate.findOne(query, User.class, "user");
        System.out.println(user.toString());
        //redisTemplate.opsForValue().set("user", JSON.toJSONString(user), 120, TimeUnit.SECONDS);
        //System.out.println(redisTemplate.opsForValue().get("user"));
    }

}

class User {
    private String name;
    private short age;
    private byte sex;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public short getAge() {
        return age;
    }
    public void setAge(short age) {
        this.age = age;
    }
    public byte getSex() {
        return sex;
    }
    public void setSex(byte sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", sex=" + sex + "]";
    }
}
