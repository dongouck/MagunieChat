package com.myspace.login.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myspace.login.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Resource
	private LoginMapper loginMapper;
	
	@Override
	public String selectCorrespondPassword(String id) {
		return loginMapper.selectCorrespondPassword(id);
	}

}
