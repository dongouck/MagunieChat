package com.myspace.magunies.service.impl;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {

	String selectBbsDate();

	void insertBbsList(HashMap<String, Object> bbsParambbsParam);

	int selectBbsId();



}
