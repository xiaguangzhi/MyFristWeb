package com.iotek.biz;

import com.iotek.entry.User;
import com.iotek.entry.UserDetail;

public interface UserBiz {
	public User login(String name,String password);
	public User checkName(String name);
	public boolean addUser(User user);
	public boolean addUserDeatail(UserDetail detail);
	
	

}
