package com.gt.wide.background.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gt.wide.background.entity.Kind;
import com.gt.wide.background.util.DBUtil;

public class KindDaoImpl implements IKindDao {

	@Override
	public List<Kind> findDirectoryByPid(Integer DirectoryId) {
		List<Kind> kinds = new ArrayList<Kind>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConn();
			String sql = "select kind_id,directory_id,kind_name,kind_describe,create_time,last_update_time,last_update_person "
					+ "from wide_kind where directory_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, DirectoryId);
			rs = pstmt.executeQuery();

			rs = pstmt.executeQuery();
			kinds = findDirectory(rs);

		} catch (SQLException e) {
			System.out.println("查询失败："+e.getMessage());
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return kinds;
	}

	@Override
	public List<Kind> findDirectoryByAll() {
		List<Kind> kinds = new ArrayList<Kind>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConn();
			String sql = "select kind_id,directory_id,kind_name,kind_describe,create_time,last_update_time,last_update_person "
					+ "from wide_kind";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			kinds = findDirectory(rs);

		} catch (SQLException e) {
			System.out.println("查询失败："+e.getMessage());
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}

		return kinds;
	}

	@Override
	public Kind findDirectoryById(Integer id) {
		Kind kind = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConn();
			String sql = "select kind_id,directory_id,kind_name,kind_describe,create_time,last_update_time,last_update_person "
					+ "from wide_kind where kind_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			rs = pstmt.executeQuery();
			kind = findDirectory(rs).get(0);

		} catch (SQLException e) {
			System.out.println("查询失败："+e.getMessage());
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return kind;
	}

	private List<Kind> findDirectory(ResultSet rs) throws SQLException{
		List<Kind> kinds = new ArrayList<Kind>();

		while(rs.next()){
			Integer kindId = rs.getInt("kind_id") ; //种类id
			Integer directoryId = rs.getInt("directory_id"); //目录id
			String kindName = rs.getString("kind_name"); //种类名称
			String kindDescribe = rs.getString("kind_describe"); //种类描述
			Date createTime = rs.getDate("create_time")==null?null:rs.getDate("create_time"); //建立时间
			Date updateTime = rs.getDate("last_update_time")==null?null:rs.getDate("last_update_time"); //修改时间
			String updatePerson = rs.getString("last_update_person")==null?null:rs.getString("last_update_person");//修改人员姓名

			Kind kind = new Kind(kindId, directoryId, kindName, kindDescribe, createTime, updateTime, updatePerson);
			kinds.add(kind);
		}


		return kinds;
	}
}
