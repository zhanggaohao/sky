package org.sky.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sky.common.utils.MD5Util;
import org.sky.common.utils.UUIDUtil;
import org.sky.dao.DO.UserDO;
import org.sky.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-mybatis.xml" })
public class TestDao {
    
    @Autowired
    private UserMapper userMapper;
    
    @Test
    public void test() {
        UserDO user = new UserDO();
        user.setId(UUIDUtil.getID());
        user.setNickname("张小天");
        user.setAccount("zhangxiaotian");
        user.setPassword(MD5Util.md5("666666"));
        user.setCreatetime(new Date());
        userMapper.saveUser(user);
    }
    
}
