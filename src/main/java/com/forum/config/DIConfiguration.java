package com.forum.config;

import org.hibernate.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.forum.dao.MemberDao;
import com.forum.dao.MemberDaoImpl;
import com.forum.service.MemberService;
import com.forum.service.MemberServiceImpl;



@Configuration
@ComponentScan("com.forum.controller")
public class DIConfiguration {
	
	@Bean(name="memberDaoImpl")
	public MemberDao getMemberDao(){
		return new MemberDaoImpl();
	}
	
	@Bean(name="memberDaoTest")
	public MemberDao getMemberDaoTest(){
		return new MemberDaoImpl();
	}
	
	@Bean(name="memberServiceImpl")
	public MemberService getMemberServiceImpl(){
		return new MemberServiceImpl();
	}
	
	
	
}
