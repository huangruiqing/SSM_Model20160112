package com.dev.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.filefilter.MagicNumberFileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	
	private final static Logger logger =  LoggerFactory.getLogger(Test.class);
	
	
	
	public static void main(String[] args) {
		
	
		double d = Math.pow(10, 1/2d);
		System.out.println(d);
		
		
		/*File file = new File("e:/d/e/f");
		File[] list = file.listFiles();
		System.out.println(list.length);*/
		
		
		// 测试版本控功能制回退123
		// huitui 2
		
		/*for (int i = 0; i < list.length; i++) {
			System.out.println("ssss:"+list[i].getPath());
		}*/
		
		//System.out.println(list);
		//file.mkdirs();
		/*try {
			FileUtils.deleteDirectory(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		/*File file = new File("c:/dd/cc/");
		file.mkdirs();
		//file.delete();
		logger.debug("filePath--> {}", file.getPath());
		try {
			FileInputStream in = FileUtils.openInputStream(file);
			FileOutputStream out = FileUtils.openOutputStream(new File("c:/user/3.png"));
			IOUtils.copy(in, out);
			out.flush();
			out.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
	
	
}
