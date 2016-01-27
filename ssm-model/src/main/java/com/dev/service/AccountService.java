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
	
	public void save(Account ac){
		accountMapper.save(ac);
		
	}
	public Account findById(Long id) {
		return accountMapper.findById(id);
	}
	public Account findByName(String userName) {
		return accountMapper.findByName(userName);
	}
	
}
