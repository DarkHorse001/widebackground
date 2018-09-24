package com.gt.wide.background.service;

import java.util.List;

import com.gt.wide.background.dao.DirectoryDaoImpl;
import com.gt.wide.background.dao.IDirectoryDao;
import com.gt.wide.background.entity.Directory;

public class DirectoryServiceImpl implements IDirectoryService {
	
	private IDirectoryDao directoryDao = new DirectoryDaoImpl();
	
	@Override
	public List<Directory> findDirectoryByPid(Integer pid) {
		if(pid == null){
			return null;
		}else{
			return directoryDao.findDirectoryByPid(pid);
		}
		
	}

	@Override
	public List<Directory> findRootDirectory() {
		return findDirectoryByPid(0);
	}

	@Override
	public List<Directory> findDirectoryByAll() {
		return directoryDao.findDirectoryByAll();
	}

}
