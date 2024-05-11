package com.mybatis.model.vo;

import java.sql.Date;

public class Student2 {
	private int student_no;
	private String student_name;
	private String student_tel;
	private String student_addr;
	private String student_email;
	private Date reg_date;
	
	public Student2() {
		// TODO Auto-generated constructor stub
	}

	public Student2(int student_no, String student_name, String student_tel, String student_addr, String student_email,
			Date reg_date) {
		super();
		this.student_no = student_no;
		this.student_name = student_name;
		this.student_tel = student_tel;
		this.student_addr = student_addr;
		this.student_email = student_email;
		this.reg_date = reg_date;
	}

	public int getStudent_no() {
		return student_no;
	}

	public void setStudent_no(int student_no) {
		this.student_no = student_no;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_tel() {
		return student_tel;
	}

	public void setStudent_tel(String student_tel) {
		this.student_tel = student_tel;
	}

	public String getStudent_addr() {
		return student_addr;
	}

	public void setStudent_addr(String student_addr) {
		this.student_addr = student_addr;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "student2 [student_no=" + student_no + ", student_name=" + student_name + ", student_tel=" + student_tel
				+ ", student_addr=" + student_addr + ", student_email=" + student_email + ", reg_date=" + reg_date
				+ "]";
	}
	
}
