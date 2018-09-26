package com.gt.wide.background.service;

import java.util.List;

import com.gt.wide.background.bean.Directory;

/**
 * 操作目录业务
 * @author qin 
 *
 */
public interface IDirectoryService {
	/**
	 * 根据目录父级目录查找它的子目录
	 * @param pid 父级目录id
	 * @return 所有该父级目录下的子目录
	 */
	List<Directory> findDirectoryByPid(Integer pid);
	
	/**
	 * 查找顶级目录
	 * @return 所有顶级目录
	 */
	List<Directory> findRootDirectory();
	
	/**
	 * 查找所有目录（早期开发项目所有，测试用）
	 * @return
	 */
	List<Directory> findDirectoryByAll();
	
}
