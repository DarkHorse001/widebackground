package test;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gt.wide.background.mapper.UserMapper;



public class UserDaoTest {
	
	@Test
	public void testChangePassword() {
		AbstractApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"spring-dao.xml");
		
		UserMapper userMapper
			= ac.getBean("userMapper", UserMapper.class);
		
//		User user = new User();
//		user.setId(15);
//		user.setPassword("5678");
//		Integer result = userMapper.changePassword(user);
//		System.out.println("result=" + result);
		
		ac.close();
	}
	
	
	
}
