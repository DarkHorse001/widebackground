package com.gt.wide.background.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gt.wide.background.bean.Kind;
import com.gt.wide.background.mapper.KindMapper;
import com.gt.wide.background.mapper.KindDaoImpl;

@Service("kindService")
public class KindServiceImpl implements IKindService {
	private KindMapper kindDao = new KindDaoImpl();
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
