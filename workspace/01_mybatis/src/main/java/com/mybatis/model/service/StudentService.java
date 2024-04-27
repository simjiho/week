package com.mybatis.model.service;

import org.apache.ibatis.session.SqlSession;
import static com.mybatis.common.SqlSessionTemplate.getSession;
import com.mybatis.model.dao.StudentDao;

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
}
