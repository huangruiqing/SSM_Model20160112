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
 * 提供保存，获取图片
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
	 * getPic 获取图片
	 * @param resopnse
	 * @param request
	 * @param picUrl 图片存放路径
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
