/**

*@description TODO
*@author Panda

 */
package com.panda.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.panda.pojo.User;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019��10��12��
 */
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO{

	/* (non-Javadoc)
	 * @see com.panda.dao.UserDao#findUserById(int)
	 */
	@Override
	public User findUserById(int id) throws Exception {
		// �̳� SqlSessionDaoSupport �࣬ͨ�� this.getSqlSession() �õ� sqlSession
        SqlSession sqlSession = this.getSqlSession();
        User user = sqlSession.selectOne("test.findUserById", id);
        return user;
	}
	
}
