package com.myspace.magunies.service;

import java.util.HashMap;

public interface HomeService {

	String selectBbsDate();

	void insertBbsList(HashMap<String, Object> bbsParam);

	int selectBbsId();

}
