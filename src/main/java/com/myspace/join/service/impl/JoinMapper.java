package com.myspace.join.service.impl;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JoinMapper {

	void insertJoinService(HashMap<String, String> joinInput);

	String selectJoinedId(String userId);

}
