package com.iotek.dao.impl;

import java.io.ObjectInputStream.GetField;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iotek.dao.UserDao;
import com.iotek.entry.User;
import com.iotek.entry.UserDetail;
import com.iotek.entry.UserInfo;

public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public User selectUser(User user) {
		String sql = "select *from User where name=? and password=?";
		List<Object> params = new ArrayList<Object>();
		List<User> list = new ArrayList<User>();
		params.add(user.getName());
		params.add(user.getPassword());
		try {
			list = operQuery(sql, params, User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public User selectUser(String name) {
		String sql = "select *from User where name=?";
		List<Object> params = new ArrayList<Object>();
		List<User> list = new ArrayList<User>();
		params.add(name);

		try {
			list = operQuery(sql, params, User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public boolean addUser(User user) {
		String sql = "insert into user(name,password) values(?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(user.getName());
		params.add(user.getPassword());

		return operUpdate(sql, params);
	}

	@Override
	public boolean addUserDeatail(UserDetail detail) {

		String sql = "insert into userdetail(uid,money,phone,email)values(?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(detail.getUid());
		params.add(detail.getMoney());
		params.add(detail.getPhone());
		params.add(detail.getEmail());
		return operUpdate(sql, params);

	}

	@Override
	public UserInfo selectUserInfo(int id) {

		String sql = " select u.id,u.name,u.password,u.age,u.image,ud.money,"
				+ "ud.phone,ud.email,uad.province,uad.city,uad.county,uad.road from  user u left join "
				+ "userdetail ud on  u.id=ud.uid left join address uad on u.id=uad.uid where u.id=?";
		/*	Connection connection = getConnection();
			try {
				Statement st = connection.createStatement();
				ResultSet rs = st.executeQuery(sql);
				rs.next();
				System.out.println("userdao:"+rs.getInt(1));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;*/
		
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		List<UserInfo> list = new ArrayList<UserInfo>();
		try {
			list = operQuery(sql, params, UserInfo.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public boolean udpateMoney(double money,int uid) {
		String sql="update  userdetail,user set userdetail.money=? "
				+ "where user.id=? and user.id=userdetail.uid";
		List<Object> params = new ArrayList<Object>();
		params.add(money);
		params.add(uid);
		return operUpdate(sql,params);
	}
	
}
