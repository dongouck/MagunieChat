package com.myspace.login.service.impl;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

	String selectCorrespondPassword(String id);

}
