package com.hoon.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {
	
	//인터넷 브라우저 요청은 get만 가능하므로 나머지는 오류남
	
	private static final String TAG= "HttpControllerTest";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m= Member.builder().username("ssar").password("1234").email("ssar@gmail.com").build(); 
		System.out.println(TAG+"getter : "+m.getUsername());
		m.setUsername("cos");
		System.out.println(TAG+"getter : "+m.getUsername());	
		return "lombok test 완료";
	}
	
	@GetMapping("/http/get")
	//public String getTest(@RequestParam int id,@RequestParam String username) {
	public String getTest(Member m) { //자동으로 mapping해줌
		return  "get 요청 : " + m.getId() +", "+ m.getUsername()+", "+ m.getPassword()+", "+ m.getEmail();
	}

	@PostMapping("/http/post") //text/plain, application/json
	public String postTest(@RequestBody Member m) { //MessageConverter(스프릥부트)
		return  "post 요청 :  " + m.getId() +", "+ m.getUsername()+", "+ m.getPassword()+", "+ m.getEmail();
	}

	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return  "put 요청 :  " + m.getId() +", "+ m.getUsername()+", "+ m.getPassword()+", "+ m.getEmail();
	}

	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return  "delete 요청";
	}
}
