package com.gt.wide.background.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;


public class DBUtil {
	private static BasicDataSource dataSource;
	static{
		Properties prop = new Properties();
		InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			prop.load(in);
			String driver=prop.getProperty("driver");
			String url=prop.getProperty("url");
			String username=prop.getProperty("username");
			String password=prop.getProperty("password");
			String initSize=prop.getProperty("initSize");
			String maxSize=prop.getProperty("maxSize");
			System.out.println(driver+" "+url+" "+username);
			dataSource = new BasicDataSource();
			//设置数据库连接参数
			dataSource.setDriverClassName(driver);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			dataSource.setPassword(password);
			dataSource.setInitialSize(Integer.parseInt(initSize));
			dataSource.setMaxActive(Integer.parseInt(maxSize));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConn() throws SQLException{
		return dataSource.getConnection();
	}

	public static void close(Connection conn,PreparedStatement ps,ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(ps!=null){
				ps.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
