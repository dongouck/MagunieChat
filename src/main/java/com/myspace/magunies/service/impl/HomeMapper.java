package com.myspace.magunies.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {

	String selectBbsDate();

	void insertBbsList(HashMap<String, Object> bbsParambbsParam);

	int selectBbsId();

	List<Map> selectHomeBbsList();



}
