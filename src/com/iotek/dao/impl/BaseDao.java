package com.iotek.dao.impl;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class BaseDao {
	public static final String driver="com.mysql.jdbc.Driver";
	public static final String path="jdbc:mysql://127.0.0.1:3306/shopcart";
	public static final String name="root";
	public static final String password="123456";
	public Connection getConnection(){
		Connection connection=null;
		try {
			Class.forName(driver);
			
			connection = DriverManager.getConnection(path,name,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	public void colse(Connection conn,Statement statement, ResultSet rs){
		if (rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//增删改的操作
	public boolean operUpdate(String sql,List<Object> list){
		Connection conn = getConnection();
		PreparedStatement ps=null;
		int res=0;
		try {
		ps= conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < list.size(); i++) {
			try {
				ps.setObject(i+1, list.get(i));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		colse(conn, ps, null);
		if (res>0) {
			return true;
		}
		return false;
	}
	/**
	 * 通过反射机制将class类构造出来一个具体的对象
	 * 使用泛型方法和反射机制进行封装
	 * @param sql
	 * @param params
	 * @param cls
	 * @return data//数据集合
	 * 
	 */
	
	public <T> List<T> operQuery(String sql,List<Object> params,Class<T> cls) throws Exception{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<T> data=new ArrayList<T>();
		try {
			conn=getConnection();
			ps=conn.prepareStatement(sql);
			if (params!=null) {
//				如果有占位符(?)在执行前将占位符(?)替换
				for (int i = 0; i <params.size(); i++) {
					 ps.setObject(i+1, params.get(i));
					}
				
			}
			rs=ps.executeQuery();//查询出来的记录封装成对应的实体类对象
			
			ResultSetMetaData rsd=rs.getMetaData();
			//得到记录集元数据对象，通过此对象可以得到表的结构包括列名和数据类型
//			 rsd.getColumnCount()得到了该结果集对象有多少列
//			rsd.getColumnName();得到了列名
			while (rs.next()) {
				//遍历结果集
				T m=cls.newInstance();//映射出每个行所对应的对象
				for (int i = 0; i < rsd.getColumnCount(); i++) {//获得每行有多少列
//					先获得这一行对应的第i列的列名
					String col_name=rsd.getColumnName(i+1);
//					获得列所对应的值
					//将列名对应的值封装成对象
				Object values=rs.getObject(col_name);
				Field field=cls.getDeclaredField(col_name);//将该列的名字映射到该对象的属性上
				field.setAccessible(true);//给私有属性设置可访问权
				field.set(m,values);//给对象的私有属性赋值
					
				}	
				data.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			colse(conn,ps,rs);//释放所有的资源
		}
		
		
		return data;//返回数据集合

		
	
	}

}
