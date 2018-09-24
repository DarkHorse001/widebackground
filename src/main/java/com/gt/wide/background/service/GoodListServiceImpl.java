package com.gt.wide.background.service;

import java.sql.SQLException;
import java.util.List;

import com.gt.wide.background.dao.GoodListDaoImpl;
import com.gt.wide.background.dao.IGoodListDao;
import com.gt.wide.background.entity.GoodList;

public class GoodListServiceImpl implements IGoodListService {
	
	private IGoodListDao goodListDao = new GoodListDaoImpl();
	
	@Override
	public GoodList findGoodListById(Integer id) throws SQLException {
		if(id==null){
			return null;
		}
		return goodListDao.findGoodListById(id);
	}

	@Override
	public List<GoodList> findGoodListByDirectoryId(Integer directoryId) throws SQLException {
		if(directoryId==null){
			return null;
		}
		return goodListDao.findGoodListByDirectoryId(directoryId);
	}

}













