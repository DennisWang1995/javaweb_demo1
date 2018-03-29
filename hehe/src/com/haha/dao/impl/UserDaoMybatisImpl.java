package com.haha.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.haha.dao.UserDao;
import com.haha.domain.Condition;
import com.haha.domain.User;
import com.haha.utils.MybatisUtils;

public class UserDaoMybatisImpl implements UserDao {
	
	public List<User> getAll(){
		SqlSession session=null;
		List<User> allUsers =null;
		try{
			session=MybatisUtils.getSession();
			allUsers=session.selectList("com.haha.domain.User.getAll");
			return allUsers;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public List<User> getByCondition(Condition c){
		SqlSession session=null;
		List<User> allUsers =null;
		try{
			session=MybatisUtils.getSession();
			allUsers=session.selectList("com.haha.domain.User.getByCondition",c);
			return allUsers;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	public void add(User u) {
		SqlSession session=null;
		try{
			session=MybatisUtils.getSession();
			session.insert("com.haha.domain.User.add",u);
			session.commit();//事务提交
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public User get(int operatorId){
		SqlSession session=null;
		try{
			session=MybatisUtils.getSession();
			return (User)session.selectOne("com.haha.domain.User.get",operatorId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	public void delete(int operatorId) {
		SqlSession session=null;
		try{
			session=MybatisUtils.getSession();
			session.delete("com.haha.domain.User.delete",operatorId);
			session.commit();//事务提交
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void update(User u) {
		SqlSession session=null;
		try{
			session=MybatisUtils.getSession();
			session.update("com.haha.domain.User.update",u);
			session.commit();//事务提交
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
