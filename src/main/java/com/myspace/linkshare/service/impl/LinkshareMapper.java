package com.myspace.linkshare.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LinkshareMapper {

	List<Map> selectLinkShareServiceList();

	void insertLinkshareService(Map<String, Object> linkParamMap);

	int selectLinkshareService();

}
