package org.sky.service.intf;

import java.util.List;

import org.sky.common.DTO.UserDTO;
import org.sky.common.httpResult.Result;
import org.sky.dao.DO.UserDO;

/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月18日 下午11:07:48
 *
 */
public interface IUserService {

    Result register(UserDTO user);

    List<UserDO> listUser();

}
