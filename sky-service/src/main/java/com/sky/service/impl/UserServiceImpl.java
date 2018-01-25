package com.sky.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import com.sky.common.DTO.UserDTO;
import com.sky.common.enums.ErrorCode;
import com.sky.common.httpResult.Result;
import com.sky.common.utils.MD5Util;
import com.sky.common.utils.UUIDUtil;
import com.sky.dao.DO.UserDO;
import com.sky.dao.mapper.UserMapper;
import com.sky.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月18日 下午11:20:27
 *
 */
@Service
public class UserServiceImpl implements UserService {
    
    private int n = 0;
    @Autowired
    private UserMapper userMapper;

    @Override
    public Result register(UserDTO userDTO) {
        Result result = Result.getInstance();
        if (StringUtils.isNotBlank(userDTO.getNickname())
                && StringUtils.isNotBlank(userDTO.getAccount())
                && StringUtils.isNotBlank(userDTO.getPassword())) {
            UserDO userDO = new UserDO();
            userDO.setId(UUIDUtil.getID());
            userDO.setNickname(userDTO.getNickname());
            userDO.setAccount(userDTO.getAccount());
            userDO.setPassword(MD5Util.md5(userDTO.getPassword()));
            userMapper.saveUser(userDO);
        } else {
            result.setErrorCode(ErrorCode.PARAMS_ERROR);
        }
        return result;
    }

    @Override
    public List<UserDO> listUser() {
        return userMapper.listUser();
    }

    @Override
    public synchronized void test() {
        if (n == 0) {
            System.out.println("test.");
            n++;
        }
    }

    @Override
    public Result login(UserDTO user) {
        Result result = Result.getInstance();
        if (StringUtils.isNotBlank(user.getAccount()) 
                && StringUtils.isNotBlank(user.getPassword())) {
            UserDO userDO = userMapper.getUserByAccount(user.getAccount());
            if (userDO != null) {
                if (StringUtils.equals(userDO.getPassword(), user.getPassword())) {
                    result.setErrorCode(ErrorCode.SYSTEM_SUCCESS);
                } else {
                    result.setErrorCode(ErrorCode.PASSWORD_ERROR); 
                }
            } else {
                result.setErrorCode(ErrorCode.ACCOUNT_NOT_EXIST);
            }
        } else {
            result.setErrorCode(ErrorCode.PARAMS_ERROR);
        }
        return result;
    }

}
