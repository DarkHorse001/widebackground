package com.gt.wide.background.service;

import java.sql.SQLException;

import com.gt.wide.background.dao.GoodDaoImpl;
import com.gt.wide.background.dao.IGoodDao;
import com.gt.wide.background.entity.Good;
import com.gt.wide.background.service.ex.GoodNotFoundException;

public class GoodServiceImpl implements IGoodService {
	private IGoodDao goodDao = new GoodDaoImpl();

	@Override
	public Good addGood(Good good) {
		//判断商品是否存在
		return goodDao.addGood(good);
	}

	@Override
	public Good findGoodByName(String name) throws SQLException {
		if(name == null){
			return null;
		}
		return goodDao.findGoodByName(name);
	}

	@Override
	public Good findGoodById(Integer id) throws SQLException{
		if(id == null){
			return null;
		}
		return goodDao.findGoodById(id);
	}

	@Override
	public Good delGoodById(Integer id) throws SQLException {
		if(id == null){
			return null;
		}
		return goodDao.delGoodById(id);
	}

	@Override
	public Good updateGood(Good good) throws SQLException, GoodNotFoundException {
		
		Good data = goodDao.updateGood(good);
		if(data == null){
			throw new GoodNotFoundException("没有找到文件夹");
		}
		return data;
	}
	
	
}








