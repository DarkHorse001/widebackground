package com.gt.wide.background.dao;

import java.util.List;

import com.gt.wide.background.entity.Kind;

/**
 * 对种类表的crud操作
 * @author qin
 *
 */
public interface IKindDao {

	/**
	 * 根据目录id获取种类
	 * @param DirectoryId 目录id
	 * @return 所有该目录id下的品牌信息
	 */
	List<Kind> findDirectoryByPid(Integer DirectoryId);

	/**
	 * 根据种类id获取种类
	 * @param DirectoryId 种类id
	 * @return 所有该目录id下的品牌信息
	 */
	Kind findDirectoryById(Integer id);
	
	/**
	 * 查找所有种类（早期开发项目所有，测试用）
	 * @return
	 */
	List<Kind> findDirectoryByAll();
}
