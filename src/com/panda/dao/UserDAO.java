/**

*@description TODO
*@author Panda

 */
package com.panda.dao;

import com.panda.pojo.User;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年10月12日
 */
public interface UserDAO {
	// 根据 id 查询用户信息
    public User findUserById(int id) throws Exception;
}
