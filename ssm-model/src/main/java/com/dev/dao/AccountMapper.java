package com.dev.dao;

import java.util.List;
import java.util.Map;

import com.dev.entity.Account;

public interface AccountMapper {

	public Account findById(long l);
	public void update(Account ac);
	public List<Account> findAll();
	public Account like(Map<String,String> map);
	public void save(Account ac);
	public Account findByName(String userName);
}
