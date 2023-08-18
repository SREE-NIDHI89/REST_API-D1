package com.Day1Excercises.Day1Excercise2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
	@RequestMapping("/welcomename")
	@ResponseBody
public String getName() {
		String s="Sreenidhi";
	return "welcome "+s+"!";
}
}
