package com.sky.service.intf;

import java.util.List;

import com.sky.common.DTO.UserDTO;
import com.sky.common.httpResult.Result;
import com.sky.dao.DO.UserDO;

/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月18日 下午11:07:48
 *
 */
public interface UserService {

    Result register(UserDTO user);

    List<UserDO> listUser();

    void test();

    Result login(UserDTO user);

}
