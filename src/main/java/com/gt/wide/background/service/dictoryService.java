package com.gt.wide.background.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gt.wide.background.dao.dictoryDao;
import com.gt.wide.background.entity.dictory;

public class dictoryService {
	private dictoryDao dao  =  new dictoryDao(); ;
	
	public int insert(dictory dict) throws SQLException
	{
		int result = 0 ;
		System.out.println("service插入前：");
		result = dao.insert(dict);
		System.out.println("result的返回值：  "+result);
		return result;
	}
	public List<dictory> showList() throws SQLException
	{
		List<dictory> list = new ArrayList<dictory>();
		list = dao.showList();
		return list;
	}
	public dictory findEleById(int id){
		dictory dict = new dictory();
		dict = dao.findEleById(id);
		return dict;
	}
	public int doUpdate(dictory dict) {
		int result = 0;
		result = dao.doUpdate(dict);	
		return result;
	}
}
////dictory dict = new dictory();
//dict.setDirectory_id(1);
//dict.setPid(0);
//dict.setDname("服装 ");
//dict.setDdescription("类别1");
//dictory dict1 = new dictory();
//dict1.setDirectory_id(2);
//dict1.setPid(1);
//dict1.setDname("男装 ");
//dict.setDdescription("归属类别1");
//list.add(dict);
//list.add(dict1);