package com.gt.wide.background.mapper;

import java.util.List;

import com.gt.wide.background.bean.Brand;

/**
 * 对品牌表的crud操作
 * @author qin
 *
 */
public interface BrandMapper {

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
		Brand findDirectoryByid(Integer id);
		
		/**
		 * 查找所有品牌（早期开发项目所有，测试用）
		 * @return
		 */
		List<Brand> findDirectoryByAll();
}
