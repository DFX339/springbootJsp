package SpringBoot_jsp.springbootJsp.service;

import SpringBoot_jsp.springbootJsp.pojo.User;

/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface UserIService {
	
	void insert(User user);
	void delete(int id);
	void edit(User user);
	User find(int id);
}
