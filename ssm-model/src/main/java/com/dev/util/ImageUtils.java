package com.dev.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * �ṩ���棬��ȡͼƬ
 * @author Administrator
 *
 */
@Controller
public class ImageUtils {

	private final static Logger logger =  LoggerFactory.getLogger(ImageUtils.class);
	
	
	
	public static void savePic(String saveUrl,File file) {
		
		try {
			FileInputStream in = FileUtils.openInputStream(file);
			FileOutputStream out = FileUtils.openOutputStream(new File(saveUrl));
			IOUtils.copy(in, out);
			out.flush();
			out.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * getPic ��ȡͼƬ
	 * @param resopnse
	 * @param request
	 * @param picUrl ͼƬ���·��
	 * @return
	 */
	public static ModelAndView getImage(HttpServletResponse resopnse,HttpServletRequest request,String picUrl) {
		
		try {
			FileInputStream in = FileUtils.openInputStream(new File(picUrl));
			 int i=in.available(); //�õ��ļ���С   
		        byte data[]=new byte[i];   
		        in.read(data);  //������   
		        resopnse.setContentType("image/*"); //���÷��ص��ļ�����   
		        OutputStream toClient=resopnse.getOutputStream(); //�õ���ͻ���������������ݵĶ���   
		        toClient.write(data);  //�������   
		          
		        toClient.flush();  
		        toClient.close();   
		        in.close();   
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("��ȡͼƬ�쳣",e.getMessage());
		}
		return null;
	}
	
}
