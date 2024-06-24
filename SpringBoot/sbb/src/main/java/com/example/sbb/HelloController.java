package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody // hello 메서드의 출력 결과가 문자열 그 자체임을 나타냄
	public String hello() {
		return "Hello SBB";
	}

}