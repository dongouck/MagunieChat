package com.myspace.bbs.Service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myspace.bbs.Service.BbsService;

@Service("bbsService")
public class BbsServiceImpl implements BbsService {

	@Resource
	private BbsMapper bbsMapper;
	

}
