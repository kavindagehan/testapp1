package com.forum.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private  Integer  id;// never use primitive data types (int,double,long...).
	//TODO add other properties :P  
	
}
