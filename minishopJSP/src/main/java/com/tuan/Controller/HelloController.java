package com.tuan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

//bỏ responebody thì sẽ trả về jsp
public class HelloController {
	@RequestMapping("/")
	public String Home() {
		
		return "Home";
	}
}
