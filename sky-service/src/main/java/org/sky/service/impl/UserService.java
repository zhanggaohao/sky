package org.sky.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.sky.common.DTO.UserDTO;
import org.sky.common.enums.ErrorCode;
import org.sky.common.httpResult.Result;
import org.sky.common.utils.MD5Util;
import org.sky.common.utils.UUIDUtil;
import org.sky.dao.DO.UserDO;
import org.sky.dao.mapper.UserMapper;
import org.sky.service.intf.IUserService;
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
public class UserService implements IUserService {
    
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
            result.setErrorCode(ErrorCode.PARAMS_IS_NULL);
        }
        return result;
    }

    @Override
    public List<UserDO> listUser() {
        return userMapper.listUser();
    }

}
