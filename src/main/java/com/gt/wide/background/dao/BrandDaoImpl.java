package com.gt.wide.background.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gt.wide.background.entity.Brand;
import com.gt.wide.background.util.DBUtil;

public class BrandDaoImpl implements IBrandDao {

	@Override
	public List<Brand> findDirectoryByPid(Integer DirectoryId) {
		List<Brand> brands = new ArrayList<Brand>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConn();
			String sql = "select Brand_id,directory_id,brand_name,Brand_describe,create_time,last_update_time,last_update_person "
					+ "from wide_brand where directory_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, DirectoryId);
			rs = pstmt.executeQuery();
			
			brands = findBrand(rs);
			
		} catch (SQLException e) {
			System.out.println("查询失败："+e.getMessage());
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return brands;
	}

	@Override
	public List<Brand> findDirectoryByAll() {
		List<Brand> brands = new ArrayList<Brand>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConn();
			String sql = "select Brand_id,directory_id,brand_name,Brand_describe,create_time,last_update_time,last_update_person "
					+ "from wide_brand";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			brands = findBrand(rs);
			
		} catch (SQLException e) {
			System.out.println("查询失败："+e.getMessage());
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return brands;
	}

	@Override
	public Brand findDirectoryByid(Integer id) {
		Brand brand = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConn();
			String sql = "select Brand_id,directory_id,brand_name,Brand_describe,create_time,last_update_time,last_update_person "
					+ "from wide_brand where Brand_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			brand = findBrand(rs).get(0);
			
		} catch (SQLException e) {
			System.out.println("查询失败："+e.getMessage());
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return brand;
	}
	
	private List<Brand> findBrand(ResultSet rs) throws SQLException{
		List<Brand> brands = new ArrayList<Brand>();
		while(rs.next()){
			Integer brandId = rs.getInt("Brand_id"); //品牌id
			Integer directoryId = rs.getInt("directory_id"); //目录id
			String brandName = rs.getString("brand_name"); //品牌名称
			String brandDescribe = rs.getString("Brand_describe"); //品牌描述
			Date createTime = rs.getDate("create_time")==null?null:rs.getDate("create_time"); //建立时间
			Date updateTime = rs.getDate("last_update_time")==null?null:rs.getDate("last_update_time"); //修改时间
			String updatePerson = rs.getString("last_update_person")==null?null:rs.getString("last_update_person");//修改人员姓名
			
			Brand brand = new Brand(brandId, directoryId, brandName, brandDescribe, createTime, updateTime, updatePerson);
			brands.add(brand);
		}
		
		return brands;
	}

}











