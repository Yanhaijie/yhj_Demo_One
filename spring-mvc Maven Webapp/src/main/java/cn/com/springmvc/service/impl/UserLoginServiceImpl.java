package cn.com.springmvc.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.springmvc.dao.LoginDao;
import cn.com.springmvc.entitys.User;
import cn.com.springmvc.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService{
	
	@Autowired
	private LoginDao loginDao;

	@Override
	public int login(User u) {
		return loginDao.login(u);
	}
}
