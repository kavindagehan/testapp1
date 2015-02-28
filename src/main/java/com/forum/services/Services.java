package com.forum.services;

import java.util.List;

import com.forum.entity.Member;

public interface Services {

	public List<Member> viewMember();
	
	public void addMember(Member member);
	
	public void updateUser(Member member);
	
	public void deleteMember(Member member);
	
}
