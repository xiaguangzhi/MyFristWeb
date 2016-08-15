package com.iotek.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.iotek.dao.UserDao;
import com.iotek.entry.User;
import com.iotek.entry.UserDetail;

public class UserDaoImpl extends BaseDao implements UserDao{

	@Override
	public User selectUser(User user) {
		String sql="select *from User where name=? and password=?";
		List<Object> params=new ArrayList<Object>();
		List<User> list=new ArrayList<User>();
		params.add(user.getName());
		params.add(user.getPassword());
		try {
			list=operQuery(sql, params, User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public User selectUser(String name) {
		String sql="select *from User where name=?";
		List<Object> params=new ArrayList<Object>();
		List<User> list=new ArrayList<User>();
		params.add(name);
		
		try {
			list=operQuery(sql, params, User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public boolean addUser(User user) {
		String sql="insert into user(name,password) values(?,?)";
		List<Object>  params=new ArrayList<Object>();
		params.add(user.getName());
		params.add(user.getPassword());
		
		return operUpdate(sql, params);
	}

	@Override
	public boolean addUserDeatail(UserDetail detail) {
		
		String sql="insert into userdetail(uid,money,phone,email)values(?,?,?,?)";
		List<Object> params=new ArrayList<Object>();
		params.add(detail.getUid());
		params.add(detail.getMoney());
		params.add(detail.getPhone());
		params.add(detail.getEmail());
		return operUpdate(sql, params);
		
	}

}
