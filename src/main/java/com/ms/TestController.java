package com.ms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apis")
public class TestController {

	@RequestMapping("test")
	public String testAPI() {
		//handling-code
		return "test success";
	}
	
	@RequestMapping("demo")
	public String demoAPI() {
		return "demo success";
	}
}

//https://localhost:8080/context-path/apis/test
//https://localhost:8080/context-path/apis/demo