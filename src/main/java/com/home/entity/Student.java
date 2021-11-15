package com.home.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table( name= "student")
@Getter
@Setter
@ToString
public class Student implements Serializable{
	@Id
	@Column( name = "roll_no")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long rollNo;
	private String name;
	private Float cgpa;
}
