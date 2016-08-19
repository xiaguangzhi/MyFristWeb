package com.iotek.dao;
/**
 * @author xiaohuang
 */

import com.iotek.entry.User;
import com.iotek.entry.UserDetail;
import com.iotek.entry.UserInfo;

public interface UserDao {
	public User selectUser(User user);
	public User selectUser(String name);
	public boolean addUser(User user);
	public boolean addUserDeatail(UserDetail detail);
	public UserInfo selectUserInfo(int id);
	public boolean udpateMoney(double money,int uid);
}
