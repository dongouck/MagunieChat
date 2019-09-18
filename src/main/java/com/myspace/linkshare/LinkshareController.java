package com.myspace.linkshare;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myspace.linkshare.service.LinkshareService;

@Controller
public class LinkshareController {
	
	@Resource(name = "linkshareService")
	private LinkshareService linkshareService;
	
	@RequestMapping(value="linkshare")
	public String links(ModelMap model) {
		
		List<Map> latestLinks=linkshareService.selectLinkShareServiceList();
		
		model.addAttribute("latestLinks", latestLinks);
		
		return "views/linkshare/linkshare.tiles";
	}
	@RequestMapping(value="linkshareWriteAction")
	public String linkWrtieAction(@RequestParam Map<String, Object> linkParamMap
			, HttpSession session) {
		
		int linkpageTableCount=linkshareService.selectLinkshareService();
		
		System.out.println("세션체크 : "+session.getAttribute("userId"));
		linkParamMap.put("writer", (String) session.getAttribute("userId"));
		linkParamMap.put("linkpageNo", linkpageTableCount);
		System.out.println(linkParamMap);
		
		linkshareService.insertLinkshareService(linkParamMap);
		
		return "redirect:/linkshare";
		
	}
}
