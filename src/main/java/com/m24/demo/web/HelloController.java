package com.m24.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/index")
	public String hello() {
		return "index";
	}
}
