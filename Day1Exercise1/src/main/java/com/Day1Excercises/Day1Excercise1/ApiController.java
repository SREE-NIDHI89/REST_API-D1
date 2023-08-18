package com.Day1Excercises.Day1Excercise1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
	@RequestMapping("/welcome")
	@ResponseBody
public String welcome() {
	return "Welcome Spring Boot";
}
}
