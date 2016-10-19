package com.snail.springmvctags.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.snail.springmvctags.entity.User;

@Controller
@RequestMapping("/UserAction")
public class UserAction {

	private Logger logger= LoggerFactory.getLogger(UserAction.class);
	
	@ModelAttribute("user")
	public User get(@RequestParam(required=false) Integer id,HttpServletRequest request){
		logger.debug("请求的地址为："+request.getRequestURL());
		User user = new User();
		user.setName("张三");
		user.setAlias("小张");
		return user;
	}

	@RequestMapping("/index")
	public String index(Model model){
		/*User user = new User();
		user.setName("张三");
		user.setAddress("成都");
		model.addAttribute("user", user);*/
		List<String> alias=new ArrayList<>();
		alias.add("小张");
		alias.add("张二娃");
		model.addAttribute("alias", alias);
		return "user/index";
	}
	
}
