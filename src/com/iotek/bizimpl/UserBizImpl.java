package com.iotek.bizimpl;
/**
 * @author xiaohuang
 */

import com.iotek.biz.UserBiz;
import com.iotek.dao.UserDao;
import com.iotek.dao.impl.UserDaoImpl;
import com.iotek.entry.User;
import com.iotek.entry.UserDetail;
import com.iotek.entry.UserInfo;

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

	@Override
	public UserInfo selectUserInfo(int id) {
		
		return userdao.selectUserInfo(id);
	}

	@Override
	public boolean updateMoney(double money,int uid) {
		return userdao.udpateMoney(money,uid);
		
	}

	
}
