package com.myspace.bbs.Service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myspace.bbs.Service.BbsDTO;
import com.myspace.bbs.Service.BbsService;

@Service("bbsService")
public class BbsServiceImpl implements BbsService {

	@Resource
	private BbsMapper bbsMapper;
	
	@Override
	public List<Map> selectTestList() {
		return bbsMapper.selectTestList();
	}

	@Override
	public void testingInsert(BbsDTO dto) {
		bbsMapper.testingInsert(dto);
	}

}
