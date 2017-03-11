package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "hello/")
@Controller
public class HelloController {

	@RequestMapping(value = "sayHello.do",method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String sayHello(HttpServletRequest request,HttpServletResponse response){
		
		return "hello world";
	}
	@RequestMapping(value = "Hello.do",method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String Hello(HttpServletRequest request,HttpServletResponse response){
		
		return "Hello";
	}
}
