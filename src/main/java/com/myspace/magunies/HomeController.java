package com.myspace.magunies;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspace.magunies.service.HomeDTO;
import com.myspace.magunies.service.HomeService;

@Controller
public class HomeController {
	
	@Resource
	private HomeService homeService;
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String home(ModelMap model) {
		
		return "views/main.tiles";
	}
	@RequestMapping(value="homeWriteAction", method = RequestMethod.GET)
	public String homeWrite(HomeDTO homeDTO) {
		
		/*
		 * String getBbsDate = homeService.selectBbsDate();
		 * System.out.println(getBbsDate);
		 */
		int bbsId=homeService.selectBbsId();
		System.out.println(bbsId);
		
		HashMap<String, Object> bbsParam=new HashMap<String, Object>();
		
		
		bbsParam.put("bbsId", bbsId);//homeDTO.getBbsID()
		bbsParam.put("content", homeDTO.getContent());
		bbsParam.put("writer", "testWriter");//임시
		
		homeService.insertBbsList(bbsParam);
		
		
		/*
		 * HashMap<String, Object> bbsParam=new HashMap<String, Object>();
		 * bbsParam.put("bbsId", homeDTO.getBbsID()); bbsParam.put("bbsId",
		 * homeDTO.getContent()); bbsParam.put("bbsId", homeDTO.getWriter());
		 * bbsParam.put("bbsId", homeDTO.getBbsDate()); bbsParam.put("bbsId",
		 * homeDTO.getLikecount()); bbsParam.put("bbsId", homeDTO.getBbsDate());
		 * 
		 * System.out.println(bbsParam);
		 */
		
		return "views/main.tiles";
	}
	
}
