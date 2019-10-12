/**

*@description TODO
*@author Panda

 */
package com.panda.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.panda.dao.UserDAO;
import com.panda.pojo.User;

/**
 * @description 
 * @author zhaoyaping
 *
 * @date 2019年10月12日
 */
public class UserServiceTest {
	private ApplicationContext applicationContext;
	
	// 在执行测试方法之前首先获取 Spring 配置文件对象
    // 注解@Before在执行本类所有测试方法之前先调用这个方法
    @Before
    public void setup() throws Exception {
        applicationContext = new
                ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }
    
    @Test
    public void testFindUserById() throws Exception {
        // 通过配置资源对象获取 userDAO 对象
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
        // 调用 UserDAO 的方法
        User user = userDAO.findUserById(1);
        // 输出用户信息
        System.out.println(user.getId() + ":" + user.getUsername());
    }
}
