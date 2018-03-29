package junit.test;

import org.junit.Before;
import org.junit.Test;

import com.haha.dao.UserDao;
import com.haha.dao.impl.UserDaoMybatisImpl;
import com.haha.domain.Condition;
import com.haha.domain.User;

public class UserDaoTest {
	private UserDao dao;
	
	@Before
	public void init(){
		dao=new UserDaoMybatisImpl();
	}
	
	@Test
	public void testGetAll(){
		System.out.println(dao.getAll());
	}
	
	@Test
	public void testGet(){
		System.out.println(dao.get(3));
	}
	
	@Test
	public void testGetByCondition(){
		Condition c=new Condition("5", 0);
		System.out.println(dao.getByCondition(c));
	}
	
	@Test
	public void testAdd(){
		User u=new User(1234, "¹þ¹þ", "ºÙºÙ", 0);
		dao.add(u);
	}
	@Test
	public void testUpdate(){
		User u=new User(1234, "ºôºô", "123456", 0);
		dao.update(u);
	}
	@Test
	public void testDelete(){
		dao.delete(1234);
	}
}
