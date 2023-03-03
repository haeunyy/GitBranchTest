package com.greedy.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String defaultLocation() {
		System.out.println("여기는 defaultLocation");
		return "main";
	}
	
	@RequestMapping("/main")
	public void main() {
	}
	
}
