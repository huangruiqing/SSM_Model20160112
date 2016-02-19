package com.dev.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dev.util.ImageUtils;

@Controller
@RequestMapping("/images")
public class ImageController {
	private final static Logger logger =  LoggerFactory.getLogger(ImageController.class);
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(String docName,MultipartFile doc) {
		
		String saveUrl="c:/user";
		if(doc != null){
			ImageUtils.savePic(saveUrl, doc,docName);
		}else{
			logger.debug("file 存放失败，doc == null");
		}
		return "redirect:/";
		
	}
	
	/**
	 * 显示图片
	 * @param request
	 * @param response
	 * @param picUrl 图片存放路径ַ
	 * @return
	 */
	@RequestMapping(value="/show/",method=RequestMethod.GET)
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response, String picUrl) {
		logger.debug("picUrl:{}",picUrl);
		return ImageUtils.getImage(response, request, picUrl);
		
	}
	
	
}
