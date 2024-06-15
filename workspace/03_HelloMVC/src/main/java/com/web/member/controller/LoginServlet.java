package com.web.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.member.dto.Member;
import com.web.member.service.MemberService;


@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인기능
		//사용자가 보낸 id, password를 가지고 -> request객체에 저장이 되어있음
		//DB의 특정테이블에 있는지 확인하고 있으면 인증처리 없으면 실패처리
		//클라이언트가 보낸 데이터를 가져오려면 
		//request.getParameter() -> 한개값을 가져올때  
		//request.getParameterValues() -> 다중값을 가져올때 
		//메소드를 이용
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		System.out.println(userId);
		System.out.println(password);
		
		String saveId=request.getParameter("saveId");
		System.out.println(saveId);
		if(saveId!=null) {
			//Cookie에 데이터 저장
			Cookie c=new Cookie("saveId",userId);
			c.setMaxAge(60*60*24);
			response.addCookie(c);
		}else {
			//저장된 Cookie를 삭제
			Cookie c=new Cookie("saveId","");
			//유지기간을 0으로 설정 -> 삭제
			c.setMaxAge(0);
			response.addCookie(c);
		}
		
		//가져온 값이 DB에 있는지 check
		//DB에 접속하기 -> JDBC jar를 추가
		//아이디가 일치하는 회원을 조회함.
		Member m=new MemberService().selectMemberById(userId);
		//System.out.println(m);
		if(m!=null && m.getPassword().equals(password)) {
			//아이디가 있는 회원 -> 인증처리
			//HttpSession객체에 저장
			HttpSession session=request.getSession();
			session.setAttribute("loginMember", m);
			//로그인 후 메인화면으로 이동
			response.sendRedirect(request.getContextPath());
			
		}else {
			//아이디 없는 회원 -> 인증실패
			request.setAttribute("msg",
					"아이디나 패스워드가 일치하지 않습니다.");
			request.setAttribute("loc", "/");
			//메세지처리 페이지로 전환하기
			RequestDispatcher rd=request
					.getRequestDispatcher("/views/common/msg.jsp");
			rd.forward(request,response);
			
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
