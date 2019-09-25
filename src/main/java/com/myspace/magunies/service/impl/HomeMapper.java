package com.myspace.magunies.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.myspace.magunies.service.HomeDTO;

@Mapper
public interface HomeMapper {

	String selectBbsDate();

	void insertBbsList(HashMap<String, Object> bbsParambbsParam);

	int selectBbsId();

	List<String> selectHomeBbsrParam();
	
	List<Map> selectHomeBbsList();

	List<Map> selectHomebbsrList(HashMap<String, Object> param);

	int selectBbsrId();

	void insertBbsrList(HashMap<String, Object> bbsrParam);

	int selectBbsrOrder(int bbsId);

	



}
