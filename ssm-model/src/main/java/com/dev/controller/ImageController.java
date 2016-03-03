package com.dev.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dev.service.ImageService;
import com.dev.util.Constant;
import com.dev.util.ImageUtils;

@Controller
@RequestMapping("/images")
public class ImageController {
	private final static Logger logger =  LoggerFactory.getLogger(ImageController.class);
	
	@Inject
	private ImageService imageService ;
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(MultipartFile doc,RedirectAttributes redirct) {
		
		if(doc != null) {
			boolean isSave = imageService.save(doc);
			if(isSave){
				redirct.addFlashAttribute("message", Constant.IMG_SU_MESSAGE);
			}else{
				redirct.addFlashAttribute("message", Constant.IMG_FA_MESSAGE);
			}
		} else{
			redirct.addFlashAttribute("message", Constant.IMG_FA_MESSAGE);
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
