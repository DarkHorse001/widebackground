package com.gt.wide.background.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gt.wide.background.bean.Directory;
import com.gt.wide.background.mapper.DirectoryDaoImpl;
import com.gt.wide.background.mapper.GoodDirectoryMapper;

@Service("directoryService")
public class DirectoryServiceImpl implements IDirectoryService {
	
	private GoodDirectoryMapper directoryDao = new DirectoryDaoImpl();
	
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
