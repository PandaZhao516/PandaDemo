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
 * @date 2019年10月12日
 */
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO{

	/* (non-Javadoc)
	 * @see com.panda.dao.UserDao#findUserById(int)
	 */
	@Override
	public User findUserById(int id) throws Exception {
		// 继承 SqlSessionDaoSupport 类，通过 this.getSqlSession() 得到 sqlSession
        SqlSession sqlSession = this.getSqlSession();
        User user = sqlSession.selectOne("test.findUserById", id);
        return user;
	}
	
}
