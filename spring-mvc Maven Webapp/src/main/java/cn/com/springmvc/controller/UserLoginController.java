package cn.com.springmvc.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.springmvc.entitys.User;
import cn.com.springmvc.service.UserLoginService;
import cn.com.springmvc.vo.Result;

@ControllerAdvice
@RestController
@RequestMapping(value="login")
public class UserLoginController{
	@Autowired
	private UserLoginService userLoginService;
	
	@RequestMapping(value="/userLogin")
	public String tests(HttpServletRequest request, HttpServletResponse response){
		Result result=new Result();
		User u=new User();
		u.setUserName(request.getParameter("userName"));
		u.setPassWord(request.getParameter("passWord"));
		int sum=userLoginService.login(u);
		System.out.println(sum);
		String s=sum+"";
		System.out.println(result);
		return s;
	}
}
