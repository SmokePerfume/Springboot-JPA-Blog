package com.hoon.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//해당 경로 return 파일명으로 이동
@Controller
public class TempControllerTest {
	
	//http://localhost:8000/blog/temp/home
	@GetMapping("/temp/home")	
	public 	String tempHome() {
		System.out.println("tempHome()");
		//파일 리턴 기본 경로 : src/main/resource/static
		//리텀명 : /home.html
		//풀경로 :  src/main/resource/static/home.html
		return "/home.html";
	}
	
	@GetMapping("/temp/img")	
	public 	String tempImg() {
		return "/a.jpg";
	}
	
	@GetMapping("/temp/jsp")	
	public 	String tempJsp() {
		// prefix: /WEB-INF/views/
		// suffix: .jsp
		// 풀네임 /WEB-INF/views/ 파일명 .jsp
		return "test";
	}
}
