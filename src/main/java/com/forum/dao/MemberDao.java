package com.forum.dao;

import java.lang.reflect.Member;
import java.util.List;

public interface MemberDao {

	public List<Member> viewMember();
	public void insertMember(Member member);
	public void updateMember(Member member);
	public void deleteMember(Member member);
	
	
	
}
