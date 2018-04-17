package SpringBoot_jsp.springbootJsp.mapper;

import org.apache.ibatis.annotations.Mapper;

import SpringBoot_jsp.springbootJsp.pojo.User;

/**
 * 持久层接口，定义增删改查方法
 * @author Administrator
 *
 */
@Mapper
public interface UserMapper {
	
	void insert(User user);
	void delete(int id);
	void edit(User user);
	User find(int id);
}
