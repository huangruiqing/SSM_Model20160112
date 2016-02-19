package com.dev.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


/**
 * 图片工具类
 * @author Administrator
 *
 */
@Named
public class ImageUtils {

	private final static Logger logger =  LoggerFactory.getLogger(ImageUtils.class);
	
	
	
	public static boolean savePic(String saveUrl,MultipartFile doc,String docName) {
		
		
		String name = docName;
		String type = doc.getContentType().substring(6);
		
		try {
			InputStream in =  doc.getInputStream();
			FileOutputStream out = new FileOutputStream("c:/user/"+docName+"."+type);
			IOUtils.copy(in, out);
			out.flush();
			out.close();
			in.close();
			return true;
		} catch (IOException e) {
			logger.error("图片name:"+name);
			e.printStackTrace();
		}
		return false;
	}
	
	
	/**
	 * getPic 获取图片
	 * @param resopnse
	 * @param request
	 * @param picUrl 
	 * @return
	 */
	public static ModelAndView getImage(HttpServletResponse resopnse,HttpServletRequest request,String picUrl) {
		
		try {
			FileInputStream in = FileUtils.openInputStream(new File(picUrl));
			 int i=in.available(); //得到文件大小   
		        byte data[]=new byte[i];   
		        in.read(data);  //读数据   
		        resopnse.setContentType("image/*"); //设置返回的文件类型   
		        OutputStream toClient=resopnse.getOutputStream(); //得到向客户端输出二进制数据的对象   
		        toClient.write(data);  //输出数据   
		          
		        toClient.flush();  
		        toClient.close();   
		        in.close();   
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("获取图片异常",e.getMessage());
		}
		return null;
	}
	
}
