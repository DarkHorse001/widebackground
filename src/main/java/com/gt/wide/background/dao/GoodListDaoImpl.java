package com.gt.wide.background.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gt.wide.background.entity.GoodList;
import com.gt.wide.background.util.DBUtil;

public class GoodListDaoImpl implements IGoodListDao {

	@Override
	public GoodList findGoodListById(Integer id) throws SQLException {
		GoodList goodList = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConn();
			String sql = "select g.good_id,g.good_name,g.directory_id,d.dname,g.brand_id,b.brand_name,g.kind_id,k.kind_name,g.good_price,g.good_count,g.good_promotion_price,g.good_sales,"
					+ "g.good_high_quality,g.good_promotion,g.good_new,g.Good_first_picture from "
					+ "	wide_goods g join wide_directory d on g.directory_id = d.directory_id"
					+ "	join wide_brand b on d.directory_id = b.directory_id "
					+ "	join wide_kind k on d.directory_id  = k.directory_id where g.good_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			goodList = findGoodList(rs).get(0);
			
		} catch (SQLException e) {
		
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return goodList;
	}

	@Override
	public List<GoodList> findGoodListByDirectoryId(Integer directoryId) throws SQLException {
		List<GoodList> goodLists = new ArrayList<GoodList>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConn();
			String sql = "select g.good_id,g.good_name,g.directory_id,d.dname,g.brand_id,b.brand_name,g.kind_id,k.kind_name,g.good_price,g.good_count,g.good_promotion_price,g.good_sales,"
					+ "g.good_high_quality,g.good_promotion,g.good_new,g.Good_first_picture from "
					+ "	wide_goods g join wide_directory d on g.directory_id = d.directory_id"
					+ "	join wide_brand b on g.brand_id = b.brand_id "
					+ "	join wide_kind k on g.kind_id  = k.kind_id where g.directory_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, directoryId);
			rs = pstmt.executeQuery();
			
			goodLists = findGoodList(rs);
			
		} catch (SQLException e) {
			throw e;
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return goodLists;
	}
	
	private List<GoodList> findGoodList(ResultSet rs) throws SQLException{
		List<GoodList> goodLists = new ArrayList<GoodList>();
		
		while(rs.next()){
			Integer id = rs.getInt("good_id"); //商品id
			String goodname = rs.getString("good_name"); //商品名称
			Integer directoryId = rs.getInt("directory_id"); //商品目录id
			String directoryName = rs.getString("dname");//商品目录名称
			Integer brandId = rs.getInt("brand_id"); //商品品牌id
			String brandName = rs.getString("brand_name");//商品目录名称
			Integer kindId = rs.getInt("kind_id"); //商品种类id
			String kindName = rs.getString("kind_name");//商品目录名称
			boolean quality = rs.getBoolean("good_high_quality"); //是否精品
			boolean promation = rs.getBoolean("good_promotion"); //是否促销
			boolean goodNew = rs.getBoolean("good_new"); //是否新品
			Double price = rs.getDouble("good_price"); //价格
			Double promotionPrice = rs.getDouble("good_promotion_price");//促销价格
			Integer count = rs.getInt("good_count"); //库存
			Integer sales = rs.getInt("good_sales"); //已售数量
			String picture = rs.getString("Good_first_picture");//第一张图片位置
			GoodList goodList = new GoodList(id, goodname, directoryId, directoryName, brandId, brandName, kindId, kindName, quality, promation, goodNew, price, promotionPrice, count, sales, picture);
			goodLists.add(goodList);
		}
		
		return goodLists;
	}
}












