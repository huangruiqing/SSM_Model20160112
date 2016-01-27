package com.dev.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dev.entity.Account;
import com.dev.service.AccountService;

@Controller
public class ReigstController {

	@Inject
	private AccountService accountService;
	
	@RequestMapping(value="/regist",method=RequestMethod.POST)
	public String regist(Account account,final RedirectAttributes redirectAttributes){
		
		accountService.save(account);
		redirectAttributes.addFlashAttribute("message","×¢²á³É¹¦£¬ÇëµÇÂ¼£¡");
		return "redirect:index";
	}
	
	
}
