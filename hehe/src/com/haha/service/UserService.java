package com.haha.service;

import java.util.List;

import com.haha.dao.UserDao;
import com.haha.dao.impl.UserDaoMybatisImpl;
import com.haha.domain.Condition;
import com.haha.domain.User;

public class UserService {
	private UserDao dao=new UserDaoMybatisImpl();
	public List<User> getAll(){
		return dao.getAll();
	}
	public List<User> getByCondition(Condition c){
		return dao.getByCondition(c);
	}
	
	public boolean addUser(User u) {
		int id=u.getOperatorId();
		User uu=dao.get(id);
		if(uu==null){
			dao.add(u);
			return true;//³É¹¦
		}else{
			return false;//Ê§°Ü
		}
	}
	public void deleteUser(int operatorId) {
		dao.delete(operatorId);
	}
	public User getUser(int operatorId) {
		return dao.get(operatorId);
	}
	public void updateUser(User u) {
		dao.update(u);
	}
}
