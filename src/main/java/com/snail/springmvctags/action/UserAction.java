package com.snail.springmvctags.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/UserAction")
public class UserAction {

	@RequestMapping("/index")
	public String index(Model model){
		return "user/index";
	}
	
}
