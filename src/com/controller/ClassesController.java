package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassesController {
	@RequestMapping("/b")
	public String Index() { 
		return "b";
	}
}
