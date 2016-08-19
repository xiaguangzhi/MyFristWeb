package com.iotek.biz;
/**
 * @author xiaohuang
 */

import com.iotek.entry.User;
import com.iotek.entry.UserDetail;
import com.iotek.entry.UserInfo;

public interface UserBiz {
	public User login(String name,String password);
	public User checkName(String name);
	public boolean addUser(User user);
	public boolean addUserDeatail(UserDetail detail);
	public UserInfo selectUserInfo(int id);
	public boolean updateMoney(double money,int uid);
	
	

}
