package com.iotek.dao;

import com.iotek.entry.User;
import com.iotek.entry.UserDetail;

public interface UserDao {
	public User selectUser(User user);
	public User selectUser(String name);
	public boolean addUser(User user);
	public boolean addUserDeatail(UserDetail detail);
	
}
