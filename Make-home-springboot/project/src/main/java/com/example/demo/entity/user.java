package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "use_dtails")
public class user {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="u_id")
	private int u_id;
	@Column(name="u_name")
	private String u_name;
	@Column(name="u_gmail")
	private String u_gmail;
	@Column(name="u_password")
	private String u_password;
	@Column(name="u_number")
	private String u_number;
	@Column(name="u_gender")
	private String u_gender;
	@Column(name="u_age")
	private int u_age;
	@Column(name="u_type")
	private String u_type;
	public user() {
	
	}
	public user(int u_id, String u_name, String u_gmail, String u_password, String u_number, String u_gender, int u_age,
			String u_type) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_gmail = u_gmail;
		this.u_password = u_password;
		this.u_number = u_number;
		this.u_gender = u_gender;
		this.u_age = u_age;
		this.u_type = u_type;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_gmail() {
		return u_gmail;
	}
	public void setU_gmail(String u_gmail) {
		this.u_gmail = u_gmail;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_number() {
		return u_number;
	}
	public void setU_number(String u_number) {
		this.u_number = u_number;
	}
	public String getU_gender() {
		return u_gender;
	}
	public void setU_gender(String u_gender) {
		this.u_gender = u_gender;
	}
	public int getU_age() {
		return u_age;
	}
	public void setU_age(int u_age) {
		this.u_age = u_age;
	}
	public String getU_type() {
		return u_type;
	}
	public void setU_type(String u_type) {
		this.u_type = u_type;
	}
	@Override
	public String toString() {
		return "user [u_id=" + u_id + ", u_name=" + u_name + ", u_gmail=" + u_gmail + ", u_password=" + u_password
				+ ", u_number=" + u_number + ", u_gender=" + u_gender + ", u_age=" + u_age + ", u_type=" + u_type + "]";
	}
	
	
	
	

}
