package com.mybatis.model.service;

import static com.mybatis.common.SqlSessionTemplate.getSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.StudentDao;
import com.mybatis.model.vo.Student;
import com.mybatis.model.vo.Student2;

public class StudentService {
	private StudentDao dao = new StudentDao();
	
	public int insertStudent() {
		SqlSession session = getSession();
		int result = dao.insertStudent(session);
		//트랜잭션처리
		if(result>0) session.commit();
		else session.rollback();
		
		session.close();
		
		return result;
	}
	
	public int insertStudentByName(String name) {
		SqlSession session = getSession();
		int result = dao.insertStudentByName(session,name);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
	}
	public int insertStudentAll(Student s) {
		SqlSession session = getSession();
		int result = dao.insertStudentAll(session,s);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
	}
	public int selectStudentCount() {
		SqlSession session = getSession();
		int result = dao.selectStudentCount(session);
		session.close();
		return result;
	}
	public Student selectStudentByNo(int no) {
		SqlSession session = getSession();
		Student s = dao.selectStudentByNo(session,no);
		session.close();
		return s;
	}
	public List<Student> studentAll(int cPage, int numPerpage){
		SqlSession session = getSession();
		List<Student> result = dao.studentAll(session,cPage,numPerpage);
		session.close();
		return result;
	}
}
