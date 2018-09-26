package com.gt.wide.background.service;

import org.springframework.stereotype.Service;

import com.gt.wide.background.bean.GoodInfo;
import com.gt.wide.background.mapper.GoodInfoDaoImpl;
import com.gt.wide.background.mapper.GoodInfoMapper;

@Service("goodInfoService")
public class GoodInfoServiceImpl implements IGoodInfoService {
	private GoodInfoMapper goodInfoDao = new GoodInfoDaoImpl();

	@Override
	public GoodInfo addGoodInfo(GoodInfo info) {
		return goodInfoDao.addGoodInfo(info);
	}
	
}
