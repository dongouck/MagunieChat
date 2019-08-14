package com.myspace.bbs.Service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.myspace.bbs.Service.BbsDTO;

@Mapper
public interface BbsMapper {

	List<Map> selectTestList();

	void testingInsert(BbsDTO dto);

}
