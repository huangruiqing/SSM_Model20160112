package com.dev.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactoryUtil {

	private static SqlSessionFactory ssf = bulidSSF();
	
	private static SqlSessionFactory bulidSSF() {
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader("mybatis.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(reader);
		
	}
	/**
	 * 获取SqlsessionFactory
	 * @return
	 */
	public static SqlSessionFactory getSSF(){
		return bulidSSF();
	}
	/**
	 * 获取SqlSession
	 * @return
	 */
	public static SqlSession getSqlSession(){
		return getSSF().openSession();
	}
	
	/**
	 * 获取SqlSession
	 * @param isAuto 是否自动提交
	 * @return
	 */
	public static SqlSession getSqlSession(Boolean isAuto) {
		return getSSF().openSession(isAuto);
	}
	
}
