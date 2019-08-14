package com.myspace.linkshare;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
