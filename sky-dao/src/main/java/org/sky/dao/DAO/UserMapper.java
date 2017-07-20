package org.sky.dao.DAO;
/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月18日 下午11:26:09
 *
 */

import org.sky.dao.DO.UserDO;

public interface UserMapper {
    
    UserDO getDOById(String id);
    
    int saveDO(UserDO user);
    
    int removeDOById(String id);
    
    int updateDO(UserDO user);
}
