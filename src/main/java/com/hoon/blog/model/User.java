package com.hoon.blog.model;

import java.sql.Timestamp;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder //빌더패턴
//ORM -> Java(다른언어) Object -> 테이블로 매핑해주는 기술 
@Entity //User클래스가 MySQL에 테이블이 생성된다.
//@DynamicInsert // insert시 null인 필드를 제외시켜준다.
public class User {

	@Id //Primary Key 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
	private int id; //시퀀스, auto_increment
	
	@Column(nullable = false, length=30)
	private String username;//아이디

	@Column(nullable = false, length=100)
	private String password;

	@Column(nullable = false, length=50)
	private String email;

	//@ColumnDefault("'user'")
	//DB는 RoleType이 없음
	@Enumerated(EnumType.STRING)//해당 필드가 string임을 알려줌
	private RoleType role; //Enum을 쓰는게 좋다. Enum은 도메인 형식으로 admin, user으로 고정 가능
	
	@CreationTimestamp //시간이 자동으로 입력
	private Timestamp createDate;
	
}
