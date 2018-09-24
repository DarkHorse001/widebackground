package com.gt.wide.background.dao;

import java.util.List;

import com.gt.wide.background.entity.Directory;

/**
 * 处理目录接口
 * @author qin
 *
 */
public interface IDirectoryDao {

	/**
	 * 根据父级id获取目录
	 * @param pid 父级id
	 * @return 所有该父级id下的目录id
	 */
	List<Directory> findDirectoryByPid(Integer pid);
	
	/**
	 * 查找顶级目录
	 * @return 所有顶级目录
	 */
	List<Directory> findDirectory();
	
	/**
	 * 查找所有目录（早期开发项目所有，测试用）
	 * @return
	 */
	List<Directory> findDirectoryByAll();
	
}
