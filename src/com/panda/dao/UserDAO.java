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
 * @date 2019��10��12��
 */
public interface UserDAO {
	// ���� id ��ѯ�û���Ϣ
    public User findUserById(int id) throws Exception;
}
