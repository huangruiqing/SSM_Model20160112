package com.dev.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReController {

	@RequestMapping(value="/in")
	public String index(Model md,HttpSession session) {
		session.setAttribute("id", "ok");
		String i = "2";
		md.addAttribute("key",i);
		float i1 = 0.056F;
		System.out.println("dddd: "+(i1 * 100));
		System.out.println("into.....");
		return "re2";
	}
	
	
}
