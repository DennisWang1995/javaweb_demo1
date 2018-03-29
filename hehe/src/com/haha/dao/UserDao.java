package com.haha.dao;

import java.util.List;

import com.haha.domain.Condition;
import com.haha.domain.User;

public interface UserDao {

	public abstract List<User> getAll();

	public abstract List<User> getByCondition(Condition c);

	public abstract void add(User u);

	public abstract User get(int operatorId);

	public abstract void delete(int operatorId);

	public abstract void update(User u);

}