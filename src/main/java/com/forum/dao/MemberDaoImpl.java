package com.forum.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.forum.entity.Member;


@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SessionFactory factory;

	public List<Member> viewMember() {
		// TODO Auto-generated method stub
		Session currentSession = factory.getCurrentSession();
		List list = currentSession.createQuery("select m from Member as m").list();
		return list;
	}

	public void insertMember(Member member) {
		// TODO Auto-generated method stub
		Session currentSession = factory.getCurrentSession();
		currentSession.save(member);
	}

	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		Session currentSession = factory.getCurrentSession();
		currentSession.update(member);
		
	}

	public void deleteMember(Member member) {
		// TODO Auto-generated method stub
		Session currentSession = factory.getCurrentSession();
		currentSession.delete(member);
		
	}
	


	
	
}
