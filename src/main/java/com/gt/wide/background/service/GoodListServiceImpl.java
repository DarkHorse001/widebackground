package com.gt.wide.background.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gt.wide.background.bean.GoodList;
import com.gt.wide.background.mapper.GoodListDaoImpl;
import com.gt.wide.background.mapper.GoodListMapper;

@Service("goodListService")
public class GoodListServiceImpl implements IGoodListService {
	
	private GoodListMapper goodListDao = new GoodListDaoImpl();
	
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













