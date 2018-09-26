package com.gt.wide.background.service;

import java.util.List;

import com.gt.wide.background.bean.Brand;

/**
 * 处理与品牌有关的服务
 * @author qin
 *
 */
public interface IBrandService {
	/**
	 * 根据目录id获取品牌
	 * @param DirectoryId 目录id
	 * @return 所有该目录id下的品牌信息
	 */
	List<Brand> findDirectoryByPid(Integer DirectoryId);

	/**
	 * 根据品牌id获取品牌
	 * @param DirectoryId 品牌id
	 * @return 所有该目录id下的品牌信息
	 */
	Brand findDirectoryById(Integer id);
	
	/**
	 * 查找所有品牌（早期开发项目所有，测试用）
	 * @return
	 */
	List<Brand> findDirectoryByAll();
}
