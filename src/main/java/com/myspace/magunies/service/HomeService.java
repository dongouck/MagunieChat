package com.myspace.magunies.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HomeService {

	String selectBbsDate();

	void insertBbsList(HashMap<String, Object> bbsParam);

	int selectBbsId();

	List<Map> selectHomeBbsList();

}
