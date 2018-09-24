package com.gt.wide.background.service;

import com.gt.wide.background.entity.GoodInfo;

public interface IGoodInfoService {
	/**
	 * 添加商品详细信息
	 * @param goodInfo 待添加的商品详细信息
	 * @return 包含id的商品详细信息
	 */
	public GoodInfo addGoodInfo(GoodInfo goodInfo);
}
