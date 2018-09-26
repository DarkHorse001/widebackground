package com.gt.wide.background.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gt.wide.background.bean.Good;
import com.gt.wide.background.bean.GoodInfo;
import com.gt.wide.background.util.DBUtil;

public class GoodInfoDaoImpl implements GoodInfoMapper {

	@Override
	public GoodInfo addGoodInfo(GoodInfo info) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConn();
			String infoSql = "insert into wide_good_info (good_id,good_details,create_time,last_update_time,last_update_person) values(?,?,now(),now(),?) ";
			pstmt = conn.prepareStatement(infoSql,PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setInt(1, info.getGoodId());
			pstmt.setString(2, info.getDetail());
			pstmt.setString(3, info.getUpdateperson());
			pstmt.executeUpdate();
			
			rs = pstmt.getGeneratedKeys();
			if(rs.next()){
				int infoId = rs.getInt(1);
				info.setId(infoId);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return info;
	}

}
