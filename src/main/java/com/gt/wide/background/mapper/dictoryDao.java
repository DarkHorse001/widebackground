package com.gt.wide.background.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gt.wide.background.bean.dictory;
import com.gt.wide.background.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class dictoryDao {
	
	public dictoryDao(){
//		try {
//			System.out.println("dictoryDao构造函数进行中~~~");
//			this.conn =  DBUtil.getConn();
//			System.out.println("dao获取conn: ~~"+conn);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public int insert (dictory dict) throws SQLException{
		Connection conn;
		PreparedStatement sta;
		ResultSet rs;
		conn = DBUtil.getConn();
		System.out.println("conn是否为空：" +conn);
		int result = 0;
		String sql = "insert into wide_directory(pid,dname,ddescription) values(?,?,?)";
		try {
			sta = (PreparedStatement) conn.prepareStatement(sql);
			sta.setInt(1, dict.getPid());
			sta.setString(2, dict.getDname());
			sta.setString(3, dict.getDdescription());
			result = sta.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(conn!=null) {
				try {
					conn.close();
					return result;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
			else
				return result;
		}
		return 0;		
	}
	public List<dictory> showList() {
		Connection conn = null;
		PreparedStatement sta;
		ResultSet rs;
		String sql = "select * from wide_directory";
		List<dictory> list = new ArrayList<dictory>();
		try {
			conn = DBUtil.getConn();
			System.out.println("dao层方法中的conn："+conn);
			sta = conn.prepareStatement(sql);
			rs = sta.executeQuery();
			while( rs.next() )
			{
				dictory dict= new dictory();
				String id = rs.getString(1);
				String pid = rs.getString(2);
				String dname = rs.getString(3);
				String dd = rs.getString(4);
				dict.setDirectory_id(Integer.parseInt(id));
				dict.setPid(Integer.parseInt(pid));
				dict.setDdescription(dd);
				dict.setDname(dname);
				list.add(dict);
			}
			System.out.println(list.get(0));
		}
		catch (Exception e) {}
		finally {
			if(conn!=null) {
				try {
					conn.close();
					return list;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
			else
				return list;
		}
		return list;
	}
	public int deleteDictory(int d_id) {
		Connection conn = null;
		PreparedStatement sta;
		ResultSet rs;
		int result = 0;
		try {
			conn = DBUtil.getConn();
			System.out.println("dao层方法中的conn："+conn);
			String sql = "DELETE FROM wide_directory WHERE directory_id = ?";
			sta = conn.prepareStatement(sql);
			sta.setInt(1, d_id);
			result = sta.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(conn!=null) {
				try {
					conn.close();
					return result;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
			else
				return result;
		}
		return result;
	}
	
	public dictory findEleById(int id) {
		dictory dict = new dictory();
		Connection conn;
		PreparedStatement sta;
		ResultSet rs;
		dict.setDirectory_id(id);
		
		String sql = "SELECT * FROM wide_directory WHERE directory_id = ?";
		try {
			conn = DBUtil.getConn();
			sta = conn.prepareStatement(sql);
			sta.setInt(1, id);
			rs = sta.executeQuery();
			if ( rs.next() )
			{
				int pid = rs.getInt("pid");
				String dname = rs.getString("dname");
				String ddescription = rs.getString("ddescription");
				dict.setPid(pid);
				dict.setDdescription(ddescription);
				dict.setDname(dname);
			}
			else 
				return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dict;
	}
	
	public int doUpdate(dictory dict) {
		int result = 0;
		Connection conn = null;
		PreparedStatement sta;
		String sql = "UPDATE wide_directory SET dname=?, ddescription=? WHERE directory_id=?";
		try {
			conn = DBUtil.getConn();
			sta = conn.prepareStatement(sql);
			sta.setString(1, dict.getDname());
			sta.setString(2, dict.getDdescription());
			sta.setInt(3, dict.getDirectory_id());
			result = sta.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
