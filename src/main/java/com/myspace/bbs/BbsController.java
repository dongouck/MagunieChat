package com.myspace.bbs;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspace.bbs.Service.BbsService;

@Controller
public class BbsController {

	@Resource(name = "bbsService")
	private BbsService bbsService;

	@Autowired
	private SqlSession sqlSession;

	@RequestMapping(value = "bbs")
	public String init(ModelMap model) {

		List<HashMap<String, String>> bbsList = sqlSession.selectList("com.myspace.bbs.Service.impl.BbsMapper.getBbsList");
		
		model.addAttribute("bbsList", bbsList);

		return "views/bbs/bbs.tiles";
	}
	@RequestMapping(value="bbsSearch")
	public String init(@RequestParam HashMap<String, String> reqMap
			, ModelMap model) {
		/*
		 * System.out.println(reqMap); String a=reqMap.get("SearchOption"); String
		 * b=reqMap.get("searchKeyword"); System.out.println("a는 "+a+"그리고 b는 "+b);
		 */
		
		List<HashMap <String, String>> searchedResult=sqlSession.selectList("com.myspace.bbs.Service.impl.BbsMapper.getSearchedList", reqMap);
		System.out.println(searchedResult);
		model.addAttribute("bbsList", searchedResult);
		
		return "views/bbs/bbs.tiles";
	}

}
