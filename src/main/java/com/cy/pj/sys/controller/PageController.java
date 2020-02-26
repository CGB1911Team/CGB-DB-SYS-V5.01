package com.cy.pj.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
	
	/*
	 * 主界面
	 */
	@RequestMapping("doIndexUI")
	public String doIndexUI() {
		return "starter";
	}
	
	/*
	 * 分页模块页面
	 */
	@RequestMapping("doPageUI")
	public String doPageUI() {
		return "common/page";
	}
	
	/*
	 * @PathVariable 这个注解表示参数的值从URL中取同名的参数值
	 * 各个模块页面
	 */
	@RequestMapping("{module}/{moduleUI}")
	public String doLogUI(@PathVariable String moduleUI) {
		return "sys/"+moduleUI;
	}
	
}
