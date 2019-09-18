package com.myspace.linkshare.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myspace.linkshare.service.LinkshareService;

@Service("linkshareService")
public class LinkshareServiceImpl implements LinkshareService{
	
	@Resource(name = "linkshareMapper")
	private LinkshareMapper linkshareMapper;

	@Override
	public List<Map> selectLinkShareServiceList() {
		return linkshareMapper.selectLinkShareServiceList();
	}

	@Override
	public void insertLinkshareService(Map<String, Object> linkParamMap) {
		linkshareMapper.insertLinkshareService(linkParamMap);
	}

	@Override
	public int selectLinkshareService() {
		return linkshareMapper.selectLinkshareService();
	}
}
