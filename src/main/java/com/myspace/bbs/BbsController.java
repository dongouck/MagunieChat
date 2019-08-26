package com.myspace.bbs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myspace.bbs.Service.BbsDTO;
import com.myspace.bbs.Service.BbsService;

@Controller
public class BbsController {

	@Resource(name = "bbsService")
	private BbsService bbsService;

	@Autowired
	private SqlSession sqlSession;

	@RequestMapping(value = "/bbs")
	public String init(ModelMap model) {

		List<HashMap<String, String>> bbsList = sqlSession.selectList("com.myspace.bbs.Service.impl.BbsMapper.getBbsList");
		
		model.addAttribute("bbsList", bbsList);

		return "views/bbs/bbs.tiles";
	}

}
