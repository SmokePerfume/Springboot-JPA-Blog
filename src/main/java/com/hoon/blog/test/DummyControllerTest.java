package com.hoon.blog.test;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hoon.blog.model.RoleType;
import com.hoon.blog.model.User;
import com.hoon.blog.repository.UserRepository;

@RestController
public class DummyControllerTest {
	
	//해당 레포지토리 테이블로 스프링이 관리하는게(bean)있다면 "의존성주입(=DI)"
	@Autowired
	private UserRepository userRepository;
	
	//{id} 주소로 파라미터를 전달 받을 수 있음
	//https://localhost:8000/blog/dummy/user/3
	@GetMapping("/dummy/user/{id}")
	public User detail(@PathVariable int id) {
		//user/4가 DB에에서 못찾는다면 user가 null로 return은 null을 하게되므로 문제가 생길 수 있다.
		//Optional로 User객체를 감싸서 가져올테니 null인지 아닌지 판단해서 return하라
		User user=userRepository.findById(id).orElseGet(new Supplier<User>() {
			@Override
			public User get() {
				// TODO Auto-generated method stub
				return new User();
			}
		}); //.get() user객체를 optional에서 뽑아줌
		
		return user;
	}
	
	//https://localhost:8000/blog/dummy/join (요청)
	//http의 body에 username, password, email 데이터를 가지고 (요청)
	@PostMapping("/dummy/join")
	public String join(User user) { //key=value (약속된 규칙)
		System.out.println("id : "+user.getId());
		System.out.println("username : "+user.getUsername());
		System.out.println("password : "+user.getPassword());
		System.out.println("email : "+user.getEmail());
		System.out.println("role : "+user.getRole());
		System.out.println("create : "+user.getCreateDate());
		
		user.setRole(RoleType.USER);
		userRepository.save(user); 
		return "회원가입이 완료되었습니다.";
		
	}
}
