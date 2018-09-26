package com.gt.wide.background.mapper;

import com.gt.wide.background.bean.GoodInfo;

/**
 * 处理与商品详细信息有关的持久层
 * @author qin
 *
 */
public interface GoodInfoMapper {
	/**
	 * 新增商品时，往商品信息表添加信息
	 * @param info 商品信息
	 * @return 包含id的商品信息
	 */
	GoodInfo addGoodInfo(GoodInfo info);
}
