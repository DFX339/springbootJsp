package SpringBoot_jsp.springbootJsp.service;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import SpringBoot_jsp.springbootJsp.mapper.UserMapper;
import SpringBoot_jsp.springbootJsp.pojo.User;
/**
 * 业务层实现类
 * @author Administrator
 *
 */

@Service("userService")
@ComponentScan({"SpringBoot_jsp.springbootJsp.mapper"})
public class UserService implements UserIService {

	@Resource 
	private UserMapper userMapper;
	
	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

	@Override
	public void delete(int id) {
		userMapper.delete(id);
		
	}

	@Override
	public void edit(User user) {
		userMapper.edit(user);		
	}

	@Override
	public User find(int id) {
		return userMapper.find(id);
	}

}
