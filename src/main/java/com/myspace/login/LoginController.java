package com.myspace.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/loginAction.do", method = RequestMethod.GET)
	public String loginAction() {
		
		System.out.println("working!");
		
		return "views/main.tiles";
	}
	
}
