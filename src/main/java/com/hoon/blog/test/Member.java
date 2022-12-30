package com.hoon.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@RequiredArgsConstructor // final붙은 친구만
@Data//getter, setter
//@AllArgsConstructor//생성자
@NoArgsConstructor//bean생성자
public class Member {
	//final 은 값을 안바꿀때
	private  int id;
	private  String username;
	private  String password;
	private  String email;
	
	@Builder
	public Member(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	
}
