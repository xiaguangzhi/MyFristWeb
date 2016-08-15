package com.iotek.bizimpl;

import com.iotek.biz.UserBiz;
import com.iotek.dao.UserDao;
import com.iotek.dao.impl.UserDaoImpl;
import com.iotek.entry.User;
import com.iotek.entry.UserDetail;

public class UserBizImpl implements UserBiz {
	private UserDao userdao;

	public UserBizImpl() {
		userdao=new UserDaoImpl();

	}

	@Override
	public User login(String name, String password) {
		User user=new User(name, password);
		return  userdao.selectUser(user);
		
		
	}

	@Override
	public User checkName(String name) {
		
		return userdao.selectUser(name);
	}

	@Override
	public boolean addUser(User user) {
		
		return userdao.addUser(user);
	}

	@Override
	public boolean addUserDeatail(UserDetail detail) {
		
		return userdao.addUserDeatail(detail);
	}

	
}
