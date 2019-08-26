package com.myspace.join.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myspace.join.service.JoinService;

@Service("joinService")
public class JoinServiceImpl implements JoinService{

	@Resource
	private JoinMapper joinMapper;
	
	@Override
	public void insertJoinService(HashMap<String, String> joinInput) {
		joinMapper.insertJoinService(joinInput);
	}

	@Override
	public String selectJoinedId(String userId) {
		return joinMapper.selectJoinedId(userId);
	}

}
