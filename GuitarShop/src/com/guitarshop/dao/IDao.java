package com.guitarshop.dao;

import java.util.List;

import com.guitarshop.bean.Guitar;



public interface IDao {

	public void addGuitar(Guitar g);
	 //添加新数据
	
	public List<Guitar> getGuitar(String serialNumber);
	//根据序列号得到吉他
	
	public Guitar search(Guitar g);
	//查询结果
	public List<Guitar> list();
}
	

