package com.dev.service;

import com.dev.dao.AccountDao;

public class AccountService {

	
	private AccountDao ad ;
	
	public void save() {
		ad.save();
	}
	
	public void setAccountDao(AccountDao ad) {// setע��
		this.ad = ad;
	}
}
