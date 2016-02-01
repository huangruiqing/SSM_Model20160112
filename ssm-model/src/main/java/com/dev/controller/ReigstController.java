package com.dev.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dev.entity.Account;
import com.dev.service.AccountService;

@Controller
public class ReigstController {

	@Inject
	private AccountService accountService;
	
	@RequestMapping(value="/regist",method=RequestMethod.POST)
	public String regist(Account account,final RedirectAttributes redirectAttributes){
		
		if(checkUserName(account.getUserName())){
			redirectAttributes.addFlashAttribute("message","给用户名已被注册！");
			return "redriet:/";
		}else{
			accountService.save(account);
			redirectAttributes.addFlashAttribute("message","注册成功，请登录！");
			return "redirect:/";
		}
		
		
	}
	
	@RequestMapping(value="/check/username",method=RequestMethod.GET)
	@ResponseBody
	public boolean checkUserName(@RequestParam(required=false,defaultValue="")String userName) {
		if(!StringUtils.isEmpty(userName)) {
			Account account = accountService.findByName(userName);
			if(account != null) {
				return false;
			}
		}
		return true;
	}
	
}
