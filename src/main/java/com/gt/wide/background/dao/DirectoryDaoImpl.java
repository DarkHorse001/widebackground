package com.gt.wide.background.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gt.wide.background.entity.Directory;
import com.gt.wide.background.util.DBUtil;

public class DirectoryDaoImpl implements IDirectoryDao {

	@Override
	public List<Directory> findDirectoryByPid(Integer pid) {
		List<Directory> directorys = new ArrayList<Directory>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConn();
			String sql = "select directory_id,pid,dname,ddescription,create_time,last_update_time,last_update_person "
					+ "from wide_directory where pid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pid);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Integer directoryId = rs.getInt("directory_id"); //目录id
				pid = rs.getInt("pid");  //父级目录id
				String dname =rs.getString("dname") ; //目录名称
				String ddescription = rs.getString("ddescription");//目录描述
				Date createTime = rs.getDate("create_time"); //建立时间
				Date updateTime = rs.getDate("last_update_time"); //修改时间
				String updatePerson = rs.getString("last_update_person"); //修改人员姓名
				
				Directory directory = new Directory(directoryId, pid, dname, ddescription, createTime, updateTime, updatePerson); 
				directorys.add(directory);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return directorys;
	}

	@Override
	public List<Directory> findDirectory() {
		
		return findDirectoryByPid(0);
	}

	@Override
	public List<Directory> findDirectoryByAll() {
		List<Directory> directorys = new ArrayList<Directory>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConn();
			String sql = "select directory_id,pid,dname,ddescription,create_time,last_update_time,last_update_person "
					+ "from wide_directory";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Integer directoryId = rs.getInt("directory_id"); //目录id
				Integer pid = rs.getInt("pid");  //父级目录id
				String dname =rs.getString("dname") ; //目录名称
				String ddescription = rs.getString("ddescription");//目录描述
				Date createTime = rs.getDate("create_time"); //建立时间
				Date updateTime = rs.getDate("last_update_time"); //修改时间
				String updatePerson = rs.getString("last_update_person"); //修改人员姓名
				
				Directory directory = new Directory(directoryId, pid, dname, ddescription, createTime, updateTime, updatePerson); 
				directorys.add(directory);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return directorys;
	}

}
