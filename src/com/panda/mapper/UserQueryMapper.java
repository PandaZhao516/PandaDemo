/**

*@description TODO
*@author Panda

 */
package com.panda.mapper;

import org.apache.ibatis.annotations.Select;

import com.panda.pojo.User;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019��10��12��
 */
public interface UserQueryMapper {
	 @Select("SELECT * FROM aUSER WHERE id = #{id}")
	 public User findUserById(int id) throws Exception;
}
