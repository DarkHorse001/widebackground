package com.gt.wide.background.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gt.wide.background.entity.User;
import com.gt.wide.background.util.DBUtil;

public class UserDaoImpl implements IUserDao {
	
	
	
//	//根据用户id获取用户信息
//	public User getUser(int id){
//		Connection conn= null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		User user = new User();
//		try {
//			
//			conn = DBUtil.getConn();
//			String sql = "select * from wide_background_users where id=?";
//			ps=conn.prepareStatement(sql);
//			ps.setInt(1, id);
//			rs = ps.executeQuery();
//			
//			if(rs.next()){
//				user.setId(rs.getInt("id"));
//				user.setUsername(rs.getString("name"));
//				user.setPassword(rs.getString("password"));
//				user.setGender(rs.getString("gender"));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally{
//			DBUtil.close(conn, ps, rs);
//		}
//		
//		return user;
//	}

	public User insert(User user){
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConn();
			String sql = "insert into wide_background_users  (NAME,PASSWORD,gender,telephone,birthday) VALUES(?,?,?,?,?)";
			ps = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getGender());
			ps.setString(4, user.getTelephone());
			ps.setDate(5, java.sql.Date.valueOf(user.getBirthday()));
			ps.execute();
			rs = ps.getGeneratedKeys();
			if(rs.next()){
				int id = rs.getInt(1);
				user.setId(id);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		
		return user;
	}

	@Override
	public User findUserByName(String username) {
		Connection conn= null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = new User();
		try {
			
			conn = DBUtil.getConn();
			String sql = "select * from wide_background_users where username=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			
			if(rs.next()){
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setGender(rs.getString("gender"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, ps, rs);
		}
		
		return user;
	}
}




















