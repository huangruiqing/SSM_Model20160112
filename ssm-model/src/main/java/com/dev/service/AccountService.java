package com.dev.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import com.dev.dao.AccountMapper;
import com.dev.entity.Account;
@Named
@Transactional
public class AccountService {
	@Inject
	private AccountMapper accountMapper;
	
	
	public Account findById(Long id) {
		return accountMapper.findById(id);
	}
	
	/*private AccountDao ad ;
	
	public void save() {
		ad.save();
	}
	
	public void setAccountDao(AccountDao ad) {// setע��
		this.ad = ad;
	}*/
}
