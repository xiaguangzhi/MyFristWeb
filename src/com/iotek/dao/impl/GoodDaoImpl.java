package com.iotek.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iotek.dao.GoodDao;
import com.iotek.entry.Good;

public class GoodDaoImpl extends BaseDao implements GoodDao{

	@Override
	public List<Good> allGood() {
		String sql="select *from good";
		
		List<Good> list=null;
		try {
			list=operQuery(sql, null, Good.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int totalRow()  {
		String sql=" select count(*) from good";
		Connection connection=getConnection();
		Statement sm=null;
		int total=0;
		try {
			sm = connection.createStatement();
			ResultSet rs = sm.executeQuery(sql);
			rs.next();
			
			return total=rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total;
	}

	@Override
	public List<Good> selectNowGood(int currentpage, int totalRow,
			int defaultRow) {
		String sql="select *from good limit ?,?";
		List<Object> params=new ArrayList<Object>();
		params.add((currentpage-1)*defaultRow);
		params.add(defaultRow);
		List<Good> goods=null;
		try {
			goods= operQuery(sql, params, Good.class);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return goods;
	}

}
