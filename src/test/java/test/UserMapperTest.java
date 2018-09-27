package test;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gt.wide.background.bean.User;
import com.gt.wide.background.mapper.UserMapper;


public class UserMapperTest {
//	@Test
//	public void insert() {
//		AbstractApplicationContext ac
//			= new ClassPathXmlApplicationContext(
//				"spring-dao.xml");
//		
//		UserMapper userMapper
//			= ac.getBean("userMapper", UserMapper.class);
//		
//		User user = new User();
//		user.setUsername("С��");
//		user.setPassword("1234");
//		userMapper.insert(user);
//		System.out.println(user);
//		
//		ac.close();
//	}
	
	@Test
	public void findUserByUsername() {
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"spring-mapper.xml");
		
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
		
		User user
			= userMapper.findUserByName("");
		System.out.println(user);
		
		ac.close();
	}
	
	public static void main(String[] args) {
		AbstractApplicationContext ac
		= new ClassPathXmlApplicationContext(
			"spring-mapper.xml");
	
	UserMapper userMapper
		= ac.getBean("userMapper", UserMapper.class);
	
	User user
		= userMapper.findUserByName("");
	System.out.println(user);
	
	ac.close();
	}
}
