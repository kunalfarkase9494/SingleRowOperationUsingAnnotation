package com.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //mapping entity
@Table(name = "stdInfo")
public class Student {
	@Id
	@Column(name = "stdRoll")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int roll_no;
	
	@Column(name = "stdName")
	String name;
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + "]";
	}
	
	
}
