package com.dev.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dev.entity.Account;
import com.dev.service.AccountService;

@Controller
public class LoginController {

	@Inject
	private AccountService accountService;
	
	
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(HttpServletRequest req,@RequestParam(required=false,defaultValue="")String userName,@RequestParam(required=false,defaultValue="")String password) {
		if(!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(password)){
			Account account = accountService.findByName(userName);
			if(account != null && password.equals(account.getPassword())){
				HttpSession session = req.getSession();
				session.setAttribute("login", "true");
				session.setAttribute("userName",account.getUserName());
			}
		}
		return "redirect:index";
	}
	
	
	
}
