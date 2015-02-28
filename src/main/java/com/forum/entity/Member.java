package com.forum.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.forum.entity.type.Address;
import com.forum.entity.type.Name;
/**
 * Member kiyanne system eke post dana cmnt dana kena .. eya thama rigister venne..
 * eyata post danna puluvan. cmnt danna puluvan..
 * ethakota eyage login info.. thava name , dob vage eva enava.
 * @author Kavinda
 *
 */
@Entity
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private  Integer  id;// never use primitive data types (int,double,long...).
	//TODO add other properties :P 
    private  Name name ; 
	private  Address address;
	private Post post;
	private Tag tag;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(length=255)
	public Integer getId() {
		return id;
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	
	@Column(length=255)
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	
	@Column(length=255)
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Column(length=255)
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
	@Column(length=255)
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  name.toString();
	}
	
}
