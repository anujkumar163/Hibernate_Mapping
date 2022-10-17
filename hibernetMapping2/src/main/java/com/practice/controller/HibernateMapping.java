package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pageone")
public class HibernateMapping {
	
	
	public String showPage() {
		return "index";
	}
}
