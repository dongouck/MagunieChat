package com.myspace.linkshare.service;

import java.util.List;
import java.util.Map;

public interface LinkshareService {

	List<Map> selectLinkShareServiceList();

	void insertLinkshareService(Map<String, Object> linkParamMap);

	int selectLinkshareService();

}
