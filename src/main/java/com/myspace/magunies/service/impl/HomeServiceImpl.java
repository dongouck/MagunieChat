package com.myspace.magunies.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myspace.magunies.service.HomeDTO;
import com.myspace.magunies.service.HomeService;

@Service("homeService")
public class HomeServiceImpl implements HomeService{

	@Resource
	private HomeMapper homeMapper;
	
	@Override
	public String selectBbsDate() {
		return homeMapper.selectBbsDate();
	}

	@Override
	public void insertBbsList(HashMap<String, Object> bbsParam) {
		homeMapper.insertBbsList(bbsParam);
	}

	@Override
	public int selectBbsId() {
		return homeMapper.selectBbsId();
	}

	@Override
	public List<Map> selectHomeBbsList() {
		return homeMapper.selectHomeBbsList();
	}

	@Override
	public List<Map> selectHomebbsrList(HashMap<String, Object> param) {
		return homeMapper.selectHomebbsrList(param);
	}

	@Override
	public int selectBbsrId() {
		return homeMapper.selectBbsrId();
	}

	@Override
	public void insertBbsrList(HashMap<String, Object> bbsrParam) {
		homeMapper.insertBbsrList(bbsrParam);
	}

	@Override
	public int selectBbsrOrder(int bbsId) {
		return homeMapper.selectBbsrOrder(bbsId);
	}

	@Override
	public List<String> selectHomeBbsrParam() {
		return homeMapper.selectHomeBbsrParam();
	}


}
