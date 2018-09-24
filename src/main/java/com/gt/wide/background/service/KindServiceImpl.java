package com.gt.wide.background.service;

import java.util.List;

import com.gt.wide.background.dao.IKindDao;
import com.gt.wide.background.dao.KindDaoImpl;
import com.gt.wide.background.entity.Kind;

public class KindServiceImpl implements IKindService {
	private IKindDao kindDao = new KindDaoImpl();
	@Override
	public List<Kind> findDirectoryByPid(Integer DirectoryId) {
		if(DirectoryId == null){
			return null;
		}else{
			return kindDao.findDirectoryByPid(DirectoryId);
		}
	}

	@Override
	public List<Kind> findDirectoryByAll() {
		return kindDao.findDirectoryByAll();
	}

	@Override
	public Kind findDirectoryById(Integer id) {
		return kindDao.findDirectoryById(id);
	}

}
