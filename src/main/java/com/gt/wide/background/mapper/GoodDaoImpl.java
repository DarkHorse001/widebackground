package com.gt.wide.background.mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gt.wide.background.bean.Good;
import com.gt.wide.background.bean.GoodInfo;
import com.gt.wide.background.util.DBUtil;

public class GoodDaoImpl implements GoodMapper {

	@Override
	public Good addGood(Good good) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Integer id = null;
		try {
			conn = DBUtil.getConn();
			String sql = "insert into wide_goods "+
					"(good_name,directory_id,brand_id,kind_id,good_price,good_count,good_sales,good_promotion_price,"
					+ "good_high_quality,good_promotion,good_new,Good_first_picture,del_flag,last_update_person) " 
					+" values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
			pstmt = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, good.getName());
			pstmt.setInt(2, good.getDirectoryId());
			pstmt.setInt(3, good.getBrandId());
			pstmt.setInt(4, good.getKindId());
			pstmt.setDouble(5, good.getPrice());
			pstmt.setInt(6, good.getCount());
			pstmt.setInt(7, good.getSales());
			pstmt.setDouble(8, good.getPromotionPrice());
			pstmt.setBoolean(9, good.isQuality());
			pstmt.setBoolean(10, good.isPromation());
			pstmt.setBoolean(11, good.isGoodNew());
			pstmt.setString(12, good.getPicture());
			pstmt.setBoolean(13, good.isFlag());
			pstmt.setString(14, good.getUpdatePerson());
			
			pstmt.executeUpdate();
			rs = pstmt.getGeneratedKeys();
			if(rs.next()){
				id =rs.getInt(1);
				good.setId(id);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return good;
	}

	@Override
	public Good findGoodByName(String name) throws SQLException {
		Good good = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConn();
			String sql = "select good_id,good_name,directory_id,brand_id,kind_id,good_price,good_count,good_sales,good_promotion_price,good_high_quality,good_promotion,good_new,Good_first_picture,del_flag,create_time,last_update_time,last_update_person "
					+ " from wide_goods where del_flag = false and good_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				Integer id = rs.getInt("good_id"); //商品id
				String goodname = rs.getString("good_name"); //商品名称
				Integer directoryId = rs.getInt("directory_id"); //商品目录id
				Integer brandId = rs.getInt("brand_id"); //商品品牌id
				Integer kindId = rs.getInt("kind_id"); //商品种类id
				boolean quality = rs.getBoolean("good_high_quality"); //是否精品
				boolean promation = rs.getBoolean("good_promotion"); //是否促销
				boolean goodNew = rs.getBoolean("good_new"); //是否新品
				Double price = rs.getDouble("good_price"); //价格
				Double promotionPrice = rs.getDouble("good_promotion_price");//促销价格
				Integer count = rs.getInt("good_count"); //库存
				Integer sales = rs.getInt("good_sales"); //已售数量
				String picture = rs.getString("Good_first_picture");//第一张图片位置
				boolean flag = rs.getBoolean("del_flag"); //删除标记
				Date createTime = rs.getDate("create_time"); //创建时间
				Date updateTime = rs.getDate("last_update_time"); //修改时间
				String updatePerson = rs.getString("last_update_person"); //修改人员姓名
				good = new Good(id, goodname, directoryId, brandId, kindId, quality, promation, goodNew, price, promotionPrice, count, sales, picture, flag, createTime, updateTime, updatePerson);
				
			}
		} catch (SQLException e) {
			throw e;
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return good;
	}

	@Override
	public Good findGoodById(Integer id) throws SQLException {
		Good good = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConn();
			String sql = "select good_id,good_name,directory_id,brand_id,kind_id,good_price,good_count,good_sales,good_promotion_price,good_high_quality,good_promotion,good_new,Good_first_picture,del_flag,create_time,last_update_time,last_update_person "
					+ " from wide_goods where del_flag = false and good_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			good = parseRs(rs).get(0);
			
		} catch (SQLException e) {
			throw e;
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return good;
	}
	
	private List<Good> parseRs(ResultSet rs) throws SQLException{
		List<Good> goods = new ArrayList<Good>();
		if(rs.next()){
			Integer goodId = rs.getInt("good_id"); //商品id
			String goodname = rs.getString("good_name"); //商品名称
			Integer directoryId = rs.getInt("directory_id"); //商品目录id
			Integer brandId = rs.getInt("brand_id"); //商品品牌id
			Integer kindId = rs.getInt("kind_id"); //商品种类id
			boolean quality = rs.getBoolean("good_high_quality"); //是否精品
			boolean promation = rs.getBoolean("good_promotion"); //是否促销
			boolean goodNew = rs.getBoolean("good_new"); //是否新品
			Double price = rs.getDouble("good_price"); //价格
			Double promotionPrice = rs.getDouble("good_promotion_price");//促销价格
			Integer count = rs.getInt("good_count"); //库存
			Integer sales = rs.getInt("good_sales"); //已售数量
			String picture = rs.getString("Good_first_picture");//第一张图片位置
			boolean flag = rs.getBoolean("del_flag"); //删除标记
			Date createTime = rs.getDate("create_time"); //创建时间
			Date updateTime = rs.getDate("last_update_time"); //修改时间
			String updatePerson = rs.getString("last_update_person"); //修改人员姓名
			Good good = new Good(goodId, goodname, directoryId, brandId, kindId, quality, promation, goodNew, price, promotionPrice, count, sales, picture, flag, createTime, updateTime, updatePerson);
			goods.add(good);
		}
		return goods;
	}

	@Override
	public Good delGoodById(Integer id) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		Good good = findGoodById(id);
		
		if(good == null){
			return null;
		}
		
		try {
			conn = DBUtil.getConn();
			String sql = "update wide_goods set del_flag = true where good_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			return good;
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
	}

	@Override
	public Good updateGood(Good good) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		Good g = null;
		
		Good data = findGoodById(good.getId());
		if(data == null){
			return null;
		}
		
		try {
			conn = DBUtil.getConn();
			String sql = "update wide_goods set good_name = ?,"
					+ "directory_id = ？,"
					+ "brand_id = ？,"
					+ "kind_id = ？,good_price=？,good_count=？,good_promotion_price=？,"
					+ "good_high_quality=？,good_promotion=？,good_new=？,Good_first_picture=？,"
					+ "last_update_time = ？,last_update_person =？ where good_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, good.getName());
			pstmt.setInt(2, good.getDirectoryId());
			pstmt.setInt(3, good.getBrandId());
			pstmt.setInt(4, good.getKindId());
			pstmt.setDouble(5, good.getPrice());
			pstmt.setInt(6, good.getCount());
			pstmt.setDouble(7, good.getPromotionPrice());
			pstmt.setBoolean(8, good.isQuality());
			pstmt.setBoolean(9, good.isPromation());
			pstmt.setBoolean(10, good.isGoodNew());
			pstmt.setString(11, good.getPicture());
			pstmt.setDate(12, java.sql.Date.valueOf(good.getUpdateTime().toString()));
			pstmt.setString(13, good.getUpdatePerson());
			pstmt.setInt(14, good.getId());
			pstmt.executeUpdate();
			
			g = findGoodById(good.getId());
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return g;
	}
	
	
}














