package com.Day1Excercises.Day1Excercise3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {
	@RequestMapping("/favcolor")
	@ResponseBody
public String getMyFav() {
	String f="Purple";
	return "My favourite colour is "+f;
}
}
