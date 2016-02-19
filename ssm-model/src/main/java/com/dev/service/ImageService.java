package com.dev.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.dev.dao.ImageMapper;
import com.dev.entity.Image;
import com.dev.util.ImageUtils;

@Named
public class ImageService {

	private Logger logger = LoggerFactory.getLogger(ImageService.class);
	
	@Inject
	private ImageMapper imageDao;
	/**
	 * 保存图片
	 * @param docName input输入
	 * @param doc 上传的文件 pic
	 * @return
	 */
	public boolean save(String docName, MultipartFile doc) {
		
		String oldName = doc.getOriginalFilename();
		if(StringUtils.isEmpty(docName)){
			docName = oldName;// docName 为空时 把原名字--> docName
		}
		String saveUrl="c:/user";
		
		Image image = new Image();
		image.setPicname(docName);
		image.setPiclink(saveUrl);
		
		if(doc != null){
			boolean isSave = ImageUtils.savePic(saveUrl, doc,docName);
			if(isSave){
				imageDao.savePic(image);
				return true;
			}
		}
		return false;
	}

}
