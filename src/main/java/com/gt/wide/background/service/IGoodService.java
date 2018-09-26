package com.gt.wide.background.service;

import java.sql.SQLException;

import com.gt.wide.background.bean.Good;
import com.gt.wide.background.service.ex.GoodNotFoundException;

/**
 * 处理商品的服务
 * @author qin
 *
 */
public interface IGoodService {
	/**
	 * 添加商品
	 * @param good 待添加的商品
	 * @return 包含id的商品
	 */
	public Good addGood(Good good);
	
	/**
	 * 根据商品名称查找商品
	 * @param name 商品名称
	 * @return 商品对象
	 */
	public Good findGoodByName(String name) throws SQLException ;

	/**
	 * 根据商品id查找商品
	 * @param id 商品名称
	 * @return 商品对象
	 */
	public Good findGoodById(Integer id) throws SQLException;
	

	/**
	 *  根据商品id删除商品
	 * @param id 商品id
	 * @throws SQLException
	 */
	Good delGoodById(Integer id)  throws SQLException;
	
	/**
	 * 	/**
	 *  * 修改商品信息
	 * @param good 待修改的商品
	 * @return 修改好的商品
	 * @throws SQLException 数据库操作异常
	 * @throws GoodNotFoundException 查找不到商品异常
	 */
	Good updateGood(Good good)  throws SQLException,GoodNotFoundException;
}













