package com.gt.wide.background.dao;

import com.gt.wide.background.entity.GoodInfo;

public interface IGoodInfoDao {
	/**
	 * 新增商品时，往商品信息表添加信息
	 * @param info 商品信息
	 * @return 包含id的商品信息
	 */
	GoodInfo addGoodInfo(GoodInfo info);
}
