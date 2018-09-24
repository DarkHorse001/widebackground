package com.gt.wide.background.service;

import com.gt.wide.background.dao.GoodInfoDaoImpl;
import com.gt.wide.background.dao.IGoodInfoDao;
import com.gt.wide.background.entity.GoodInfo;

public class GoodInfoServiceImpl implements IGoodInfoService {
	private IGoodInfoDao goodInfoDao = new GoodInfoDaoImpl();

	@Override
	public GoodInfo addGoodInfo(GoodInfo info) {
		return goodInfoDao.addGoodInfo(info);
	}
	
}
