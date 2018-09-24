package com.gt.wide.background.service;

import java.util.List;

import com.gt.wide.background.dao.BrandDaoImpl;
import com.gt.wide.background.dao.IBrandDao;
import com.gt.wide.background.entity.Brand;

public class BrandServiceImpl implements IBrandService {
	
	private IBrandDao brandDao = new BrandDaoImpl();
	
	@Override
	public List<Brand> findDirectoryByPid(Integer DirectoryId) {
		if(DirectoryId == null){
			return null;
		}else{
			return brandDao.findDirectoryByPid(DirectoryId);
		}
	}

	@Override
	public List<Brand> findDirectoryByAll() {
		return brandDao.findDirectoryByAll();
	}

	@Override
	public Brand findDirectoryById(Integer id) {
		return brandDao.findDirectoryByid(id);
	}

}




