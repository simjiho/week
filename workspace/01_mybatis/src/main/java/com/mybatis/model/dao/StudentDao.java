package com.mybatis.model.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.vo.Student;
import com.mybatis.model.vo.Student2;

public class StudentDao {
	public int insertStudent(SqlSession session) {
		//mybatis를 이용해서 sql문을 실행할 때는 
		//SqlSession이 제공하는 메소드를 이용
		//insert(), update(), delete(), selectOne(), selectList()
		//인수값은 mapper정보, sql정보를 string으로 전달 -> mapper.xml에서 설정
		//외부에서 전달된 데이터가 있으면 필요한 값을 전달
		
		//첫번째 매게변수에 인수로 : mapper태그의 namespace명.sql태그의 id명
		int result = session.insert("student.insertStudent");
		return result;
	}
	public int insertStudentByName(SqlSession session, String name) {
		return session.insert("student.insertStudentByName",name);
	}
	public int insertStudentAll(SqlSession session, Student s) {
		return session.insert("student.insertStudentAll",s);
	}
	public int selectStudentCount(SqlSession session) {
		//조회를 할 때는 두개의 메소드를 이용할 수 있음.
		//selectOne() : 조회결과(ResultSet)가 0~1개 row를 가질때 사용
		//selectList() : 조회결과(ResultSet)가 0~1개 이상의 row를 가질때 사용
		 return session.selectOne("student.selectStudentCount");
		
	}
	public Student selectStudentByNo(SqlSession session, int no) {
		return session.selectOne("student.selectStudentByNo",no);
	}
	
	public List<Student> studentAll(SqlSession session, int cPage, int numPerpage){
		//다수의 row를 조회한 결과를 가져오는 기능
		//selectList()메소드를 이용한다.
		//페이징처리를 위한 객체를 생성해줌.
		//Rowbounds클래스를 이용해서 처리
		//매게변수 있는 생성자를 이용해서 생성
		//두개의 인자를 전달
		//1 : offset : 시작 row번호를 전달(0부터 시작)
			//-> (cPage-1)*numPerpage
		//2 : limit : 간격 -> ->numPerpage
		
		RowBounds row = new RowBounds((cPage-1) *numPerpage, numPerpage);
		
		return session.selectList("student.studentAll",null,row);
	}
}










