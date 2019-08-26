package com.myspace.join.service;

import java.util.HashMap;

public interface JoinService {

	void insertJoinService(HashMap<String, String> joinInput);

	String selectJoinedId(String userId);

	
	
}
