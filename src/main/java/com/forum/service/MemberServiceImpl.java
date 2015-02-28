package com.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.forum.dao.MemberDao;
import com.forum.entity.Member;

public class MemberServiceImpl implements MemberService {
	
	
@Autowired	
private MemberDao dao;

	@Transactional
	public List<Member> viewMember() {
		List<Member> viewMember = dao.viewMember();
		
		return viewMember;
	}
	@Transactional
	public void insertMember(Member member) {
		dao.insertMember(member);
		

	}
	@Transactional
	public void updateMember(Member member) {
		dao.updateMember(member);

	}
	@Transactional
	public void deleteMember(Member member) {
		dao.deleteMember(member);

	}

}
