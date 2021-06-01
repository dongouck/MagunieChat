package com.myspace.magunies;

import com.myspace.magunies.service.HomeDTO;
import com.myspace.magunies.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
	
	BbsManager bm=new BbsManager();
	
	@Resource
	private HomeService homeService;
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String home(ModelMap model, HttpServletRequest request) {
		
		//List<String> homeBbsrParam=homeService.selectHomeBbsrParam();
		//System.out.println(homeBbsrParam);
		HashMap<String, Object> param=new HashMap<String, Object>();
		for(int i=1; i<6; i++) {
			//param.put(""+i, homeBbsrParam.get(0));
		}
		
		System.out.println("toString : "+param );
		
		List<Map> homeBbsList=homeService.selectHomeBbsList();
		List<Map> homeBbsrList=homeService.selectHomebbsrList(param);
		
		System.out.println("homeBbsList"+homeBbsrList);
		
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
	public String homebbsrWrite(HomeDTO homeDTO, HttpSession session) {
		
		int bbsrOrder=homeService.selectBbsrOrder(homeDTO.getBbsId());
		String bbsrId=bm.bbsrNumbering(homeDTO.getBbsId(), bbsrOrder);
		
		HashMap<String, Object> bbsrParam=new HashMap<String, Object>();
		
		bbsrParam.put("bbsId",	homeDTO.getBbsId());
		bbsrParam.put("bbsrId",	bbsrId);
		bbsrParam.put("writer", session.getAttribute("userId"));
		bbsrParam.put("reply",homeDTO.getReply());
		bbsrParam.put("bbsrAvailable",1);
		
		homeService.insertBbsrList(bbsrParam);
		
		return "redirect:/main";
	}
}
