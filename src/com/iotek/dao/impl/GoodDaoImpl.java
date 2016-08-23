package com.iotek.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iotek.dao.GoodDao;
import com.iotek.entry.Good;
import com.iotek.entry.GoodDetail;
import com.iotek.entry.GoodInfo;

public class GoodDaoImpl extends BaseDao implements GoodDao {

	@Override
	public List<Good> allGood() {
		String sql = "select *from good";

		List<Good> list = null;
		try {
			list = operQuery(sql, null, Good.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int totalRow() {
		String sql = " select count(*) from good";
		Connection connection = getConnection();
		Statement sm = null;
		int total = 0;
		try {
			sm = connection.createStatement();
			ResultSet rs = sm.executeQuery(sql);
			rs.next();

			return total = rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total;
	}

	@Override
	public List<Good> selectNowGood(int currentpage, int totalRow,
			int defaultRow) {
		String sql = "select *from good limit ?,?";
		List<Object> params = new ArrayList<Object>();
		params.add((currentpage - 1) * defaultRow);
		params.add(defaultRow);
		List<Good> goods = null;
		try {
			goods = operQuery(sql, params, Good.class);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return goods;
	}

	@Override
	public boolean addGoods(Good good) {
		String sql = "insert into good(gname,gprice,goodtype)values(?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(good.getGname());
		params.add(good.getGprice());
		params.add(good.getGoodtype());
		return operUpdate(sql, params);
	}

	@Override
	public boolean addGoodsDetail(GoodDetail detail) {
		String sql = "insert into gooddetail(gid,image1,image2,image3,image4,caption)values(?,?,?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(detail.getGid());
		params.add(detail.getImage1());
		params.add(detail.getImage2());
		params.add(detail.getImage3());
		params.add(detail.getImage4());
		params.add(detail.getCaption());
		return operUpdate(sql, params);

	}

	@Override
	public Good selectGoods(Good good) {
		String sql = "select *from good where gname=? and gprice=? and goodtype=?";
		List<Object> params = new ArrayList<Object>();
		params.add(good.getGname());
		params.add(good.getGprice());
		params.add(good.getGoodtype());
		List<Good> list = new ArrayList<Good>();
		try {
			list = operQuery(sql, params, Good.class);
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
	public List<GoodInfo> selectGoodInfo() {
		String sql="select g.id,g.gname,g.gprice,g.goodtype, gd.image1,gd.caption"
				+ " from good g ,gooddetail gd where g.id=gd.gid";
		List<GoodInfo> list=null;
		
		try {
			return operQuery(sql, null,GoodInfo.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public GoodInfo selectGoodInfo(int goodid) {
			String sql="select g.id,g.gname,g.gprice,g.goodtype,gd.image1,gd.image2,gd.image3,gd.image4,gd.caption from good g, "
					+ "gooddetail gd where g.id=? and g.id=gd.gid";
			List<Object> params = new ArrayList<Object>();
			params.add(goodid);
			List<GoodInfo> list = new ArrayList<GoodInfo>();
			try {
				list = operQuery(sql, params, GoodInfo.class);
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
	public Good selectGoods(int id) {
		String sql="select * from good where id=?";
		List<Object> params = new ArrayList<Object>();
		params.add(id);
		List<Good> list = new ArrayList<Good>();
		try {
			list = operQuery(sql, params, Good.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}

}
