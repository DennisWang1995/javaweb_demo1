package junit.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.haha.dao.UserDao;
import com.haha.dao.impl.UserDaoMybatisImpl;
import com.haha.domain.User;
import com.haha.utils.MybatisUtils;

public class TestMybatis {

	@Test
	public void test() {
		try {
			InputStream in=Resources.getResourceAsStream("mybatis/mybatis-config.xml");
			SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
			SqlSession session=factory.openSession();
			List<User> list=session.selectList("com.haha.domain.User.getAll");
			System.out.println(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
