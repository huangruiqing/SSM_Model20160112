package com.dev.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dev.entity.Account;

@Controller
@RequestMapping("/person")
public class PersonController {

	@RequestMapping(value="",method=RequestMethod.GET)
	public String person(Model model,HttpServletRequest req) {
		Account account = (Account) req.getSession().getAttribute("account");
		model.addAttribute(account);
		
		return "user/infromation";
	}
	
	
	
}
