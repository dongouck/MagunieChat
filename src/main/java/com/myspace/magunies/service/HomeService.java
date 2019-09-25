package com.myspace.magunies.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HomeService {

	List<String> selectHomeBbsrParam();
	
	List<Map> selectHomeBbsList();

	List<Map> selectHomebbsrList(HashMap<String, Object> param);
	
	String selectBbsDate();

	void insertBbsList(HashMap<String, Object> bbsParam);

	int selectBbsId();

	int selectBbsrId();

	void insertBbsrList(HashMap<String, Object> bbsrParam);

	int selectBbsrOrder(int bbsId);

	//정리필요
}
