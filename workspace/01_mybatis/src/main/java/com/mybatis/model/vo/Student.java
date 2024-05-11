package com.mybatis.model.vo;

import java.sql.Date;


public class Student {
	private int studentNo;
	private String studentName;
	private String studentTel;
	private String studentAddr;
	private String studentEmail;
	private Date enrollDate;
	
	//ctrl + space
	public Student() {}
	
	//alt+s+a+g
	public Student(int studentNo, String studentName, String studentTel, String studentAddr, String studentEmail,
			Date enrollDate) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentTel = studentTel;
		this.studentAddr = studentAddr;
		this.studentEmail = studentEmail;
		this.enrollDate = enrollDate;
	}

	//alt+s+r+a+r+enter
	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentTel() {
		return studentTel;
	}

	public void setStudentTel(String studentTel) {
		this.studentTel = studentTel;
	}

	public String getStudentAddr() {
		return studentAddr;
	}

	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	//alt+s+s+s+enter
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", studentTel=" + studentTel
				+ ", studentAddr=" + studentAddr + ", studentEmail=" + studentEmail + ", enrollDate=" + enrollDate
				+ "]";
	}
}
