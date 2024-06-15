package com.web.member.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.member.dto.Member;
import com.web.member.service.MemberService;

/**
 * Servlet implementation class MemberEndrollEndServlet
 */
@WebServlet(name = "MemberEnrollEndServlet", urlPatterns = { "/member/enrollend.do" })
public class MemberEnrollEndServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberEnrollEndServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트가 form태그로 전송한 데이터를 
		//정해진 DB에 저장하는 기능
		String userId =request.getParameter("userId");
		String password =request.getParameter("password");
		String userName =request.getParameter("userName");
		int age =Integer.parseInt(request.getParameter("age"));
		String email =request.getParameter("email");
		String phone =request.getParameter("phone");
		String address =request.getParameter("address");
		String gender =request.getParameter("gender");
		String[] hobby =request.getParameterValues("hobby");
		
		//VO클래스 선언
		Member m = new Member();
		m.setUserId(userId);
		m.setPassword(password);
		m.setUserName(userName);
		m.setAge(age);
		m.setEmail(email);
		m.setPhone(phone);
		m.setAddress(address);
		m.setGender(gender);
		m.setHobby(String.join(",",hobby));
		
		int result = new MemberService() .insertMember(m);
		String msg,loc;
		if(result>0) {
			//성공
			msg="회원가입을 축하드립니다 :D";
			loc="/";
		}else {
			//실패
			msg="회원가입에 실패했습니다:(";
			loc="/member/enrollmember.do";
		}
		request.setAttribute("msg", msg);
		request.setAttribute("loc", loc);
		request.getRequestDispatcher("/views/common/msg.jsp")
		.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
