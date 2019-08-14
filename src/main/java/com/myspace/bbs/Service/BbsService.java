package com.myspace.bbs.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

public interface BbsService {

	List<Map> selectTestList();

	void testingInsert(BbsDTO dto);

}
