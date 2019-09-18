package com.myspace.magunies;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
		
		List<Map> homeBbsList=homeService.selectHomeBbsList();
		List<Map> homeBbsrList=homeService.selectHomebbsrList();
		
		model.addAttribute("homeBbsList",	homeBbsList);
		model.addAttribute("homeBbsrList",	homeBbsrList);
		
		return "views/main.tiles";
	}
	
	@RequestMapping(value="BbsWriteAction", method = RequestMethod.POST)
	public String homeWrite(ModelMap model, HomeDTO homeDTO, HttpSession session) {
		
		int bbsId=homeService.selectBbsId();
		
		HashMap<String, Object> bbsParam=new HashMap<String, Object>();
		bbsParam.put("bbsId", bbsId);//homeDTO.getbbsId()
		bbsParam.put("content", homeDTO.getContent());
		bbsParam.put("writer", session.getAttribute("userId"));//임시
		bbsParam.put("bbsAvailable", 1);//
		
		homeService.insertBbsList(bbsParam);
		
		List<Map> homeBbsList=homeService.selectHomeBbsList();
		
		model.addAttribute("homeBbsList", homeBbsList);
		
		return "redirect:/main";
	}
	@RequestMapping(value="homebbsrWriteAction", method = RequestMethod.POST)
	public String homebbsrWrite(HomeDTO homeDTO) {
		
		HashMap<String, Object> bbsrParam=new HashMap<String, Object>();
		int bbsrId=homeService.selectBbsrId();
		bbsrParam.put("bbsId",	homeDTO.getBbsId());
		bbsrParam.put("bbsrId",	bbsrId);
		bbsrParam.put("reply",homeDTO.getReply());
		bbsrParam.put("bbsrAvailable",1);
		//homeDTO.getBbsId()+"-"+
		bbsrId=String.valueOf(bbsrId);
		System.out.println(bbsrId);
		/* homeService.insertBbsrList(bbsrParam); */
		
		return "redirect:/main";
	}
}
