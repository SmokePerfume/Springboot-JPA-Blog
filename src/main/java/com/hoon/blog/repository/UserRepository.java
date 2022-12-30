package com.hoon.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoon.blog.model.User;

//DAO
//자동으로 bean등록이 된다.
//@Repository 생략가능

public interface UserRepository extends JpaRepository<User, Integer>{

}
