package com.forum.dao;


import java.util.List;

import com.forum.entity.Member;

public interface MemberDao {

	public List<Member> viewMember();
	public void insertMember(Member member);
	public void updateMember(Member member);
	public void deleteMember(Member member);
	
	
	
}
