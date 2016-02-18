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
import com.dev.util.Constant;

@Controller
public class ReigstController {

	@Inject
	private AccountService accountService;
	
	/**
	 * 注册用户
	 * @param account form表单account对象封装
	 * @param redirectAttributes 用来重定向传回参数的对象
	 * @return 
	 */
	@RequestMapping(value="/regist",method=RequestMethod.POST)
	public String regist(Account account,final RedirectAttributes redirectAttributes){
		
		
		if(account != null && account.getUserName() != null && checkUserName(account.getUserName())){
			redirectAttributes.addFlashAttribute("message",Constant.REG_FA_MEASSAGE);
			return "redriet:/";
		}else{
			accountService.save(account);
			redirectAttributes.addFlashAttribute("message",Constant.REG_SU_MEASSAGE);
			return "redirect:/";
		}
		
		
	}
	
	/**
	 * 注册时检测用户是否已经存在了
	 * @param userName
	 * @return 不存在 true,存在 false
	 */
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
