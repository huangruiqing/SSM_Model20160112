package com.dev.controller;

import java.io.IOException;

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
	public void save(String docName,MultipartFile doc) {
		logger.debug("docName: {}",docName);
		logger.debug("name: {}-- ",doc.getName());
		logger.debug("originName:{}-- ",doc.getOriginalFilename());
		logger.debug("szie: {}-- ",doc.getSize());
		logger.debug("type: {}-- ",doc.getContentType());
		logger.debug("class: {} --",doc.getClass());
	}
	
	/**
	 * 获取图片
	 * @param request
	 * @param response
	 * @param picUrl 存放地址
	 * @return
	 */
	@RequestMapping(value="/show/",method=RequestMethod.GET)
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response, String picUrl) {
		logger.debug("picUrl:{}",picUrl);
		return ImageUtils.getImage(response, request, picUrl);
		
	}
	
	
}
