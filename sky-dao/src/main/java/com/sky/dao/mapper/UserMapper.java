package com.sky.dao.mapper;
/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月18日 下午11:26:09
 *
 */

import java.util.List;

import com.sky.dao.DO.UserDO;

public interface UserMapper {
    
    int saveUser(UserDO user);
    
    UserDO getUserById(String id);

    List<UserDO> listUser();
    
    UserDO getUserByAccount(String account);
    
}
