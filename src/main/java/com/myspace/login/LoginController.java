package com.myspace.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspace.login.service.LoginService;

@Controller
public class LoginController {

	@Resource()
	private LoginService loginService;

	@RequestMapping(value = "loginAction", method = RequestMethod.POST)
	public String loginAction(String userId, String userPassword, HttpSession session, ModelMap model) {
		try {
			System.out.println(userId + " " + userPassword);
			String correspondPassword = loginService.selectCorrespondPassword(userId);
			System.out.println(correspondPassword + " " + userPassword);
			
			if (userPassword.equals(correspondPassword)) {
				System.out.println("로그인 성공");
				// session.setAttribute(name, value);
				session.setAttribute("userId", userId);

			} else {
				System.out.println("로그인 실패");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/main";
	}
	@RequestMapping(value="logout")
	public String loginOutAction(HttpSession session) {
		
		session.invalidate();
		return "redirect:/main";
	}

	public int loginchk(String userId, String password, HttpSession session) {

		return 1;
	}
}
