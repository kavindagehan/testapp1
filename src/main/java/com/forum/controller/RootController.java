package com.forum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forum.entity.Member;
import com.forum.entity.type.Name;
import com.forum.service.MemberService;


@Controller
@Component
public class RootController {
	
	@Autowired
	@Qualifier("memberServiceImpl")
	private MemberService serviceMe;

	@RequestMapping(value = "/")
	public String root(Model model) {
		Member member = new Member();
		Name name = new Name();
		name.setFirstName("Kalinga");
		name.setLastName("Devaaa");
		member.setName(name);
		serviceMe.insertMember(member);
		
		return "index";
		
	}

}
