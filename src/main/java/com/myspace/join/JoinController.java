package com.myspace.join;

import java.io.PrintWriter;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspace.join.service.JoinService;
import com.myspace.user.User;

@Controller
public class JoinController {

	@Resource
	private JoinService joinService;

	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {

		return "views/join/join.tiles";
	}

	@RequestMapping(value = "joinAction", method = RequestMethod.POST)
	public void join(User user, HttpServletResponse response,HttpSession session) throws Exception {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		if (user.getUserId().equals("") || user.getUserPassword().equals("") || 
			user.getUserName().equals("")) {

			out.println("<script>" 
			+ "alert('입력되지 않은 항목이 있습니다.'); " 
			+ "history.back()" 
			+ "</script>");
			out.flush();

		} else {

			HashMap<String, String> joinInput = new HashMap<String, String>();

			joinInput.put("id", user.getUserId());
			joinInput.put("password", user.getUserPassword());
			joinInput.put("name", user.getUserName());

			joinService.insertJoinService(joinInput);
			session.setAttribute("userId", user.getUserId());
			out.println("<script>" 
						+ "alert('가입이 완료됐습니다.'); " 
						+ "location.href = 'main.do';" 
						+ "</script>");

			out.flush();
		}
	}

	@RequestMapping(value = "test", method = RequestMethod.POST)
	public String test() {

		return "";
	}
}
