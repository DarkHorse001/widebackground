package com.gt.wide.background.mapper;

import java.sql.SQLException;

import com.gt.wide.background.bean.Good;

/**
 * 处理与商品有关的持久层
 * @author qin
 *
 */
public interface GoodMapper {
	/**
	 * 新增商品
	 * @param good 待添加的商品
	 * @return 包含id的商品
	 */
	Good addGood(Good good);
	
	/**
	 * 根据商品名称查找商品
	 * @param name 商品名称
	 * @return 商品对象
	 */
	public Good findGoodByName(String name) throws SQLException ;

	/**
	 * 根据商品id查找商品
	 * @param id 商品id
	 * @return 商品对象
	 */
	Good findGoodById(Integer id) throws SQLException;
	
	/**
	 *  根据商品id删除商品
	 * @param id 商品id
	 * @throws SQLException
	 */
	Good delGoodById(Integer id)  throws SQLException;
	
	/**
	 * 修改商品信息
	 * @param good 待修改的商品
	 * @return 修改好的商品  null 表示没有找到该商品 
	 */
	Good updateGood(Good good)  throws SQLException;
}











