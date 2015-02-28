package com.forum.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Post implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private Set<Tag> 	 tags = new HashSet<Tag>();
	
	@ManyToMany(fetch=FetchType.EAGER,cascade={CascadeType.REMOVE},targetEntity=Tag.class)
	@JoinTable(name = "postTag", joinColumns = { 
			@JoinColumn(name = "post", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "tag", 
					nullable = false, updatable = false) })
	public Set<Tag> getTags() {
		return tags;
	}
	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

}
