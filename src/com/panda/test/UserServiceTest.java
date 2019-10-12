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
 * @date 2019��10��12��
 */
public class UserServiceTest {
	private ApplicationContext applicationContext;
	
	// ��ִ�в��Է���֮ǰ���Ȼ�ȡ Spring �����ļ�����
    // ע��@Before��ִ�б������в��Է���֮ǰ�ȵ����������
    @Before
    public void setup() throws Exception {
        applicationContext = new
                ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }
    
    @Test
    public void testFindUserById() throws Exception {
        // ͨ��������Դ�����ȡ userDAO ����
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
        // ���� UserDAO �ķ���
        User user = userDAO.findUserById(1);
        // ����û���Ϣ
        System.out.println(user.getId() + ":" + user.getUsername());
    }
}
