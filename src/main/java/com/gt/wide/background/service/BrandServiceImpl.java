package com.gt.wide.background.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gt.wide.background.bean.Brand;
import com.gt.wide.background.mapper.BrandDaoImpl;
import com.gt.wide.background.mapper.BrandMapper;

@Service("brandService")
public class BrandServiceImpl implements IBrandService {
	
	private BrandMapper brandDao = new BrandDaoImpl();
	
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




