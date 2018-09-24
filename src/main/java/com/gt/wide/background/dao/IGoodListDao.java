package com.gt.wide.background.dao;

import java.sql.SQLException;
import java.util.List;

import com.gt.wide.background.entity.GoodList;

public interface IGoodListDao {
	/**
	 * 根据商品的id查找商品
	 * @param id 商品id
	 * @return 商品
	 */
	GoodList findGoodListById(Integer id) throws SQLException;
	
	/**
	 * 根据目录id查找商品集合
	 * @param directoryId 商品id
	 * @return 商品集合
	 */
	List<GoodList> findGoodListByDirectoryId(Integer directoryId ) throws SQLException;
}
