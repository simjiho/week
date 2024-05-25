package com.mybatis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.service.StudentService;
import com.mybatis.model.vo.Student;

/**
 * Servlet implementation class selectAllServlet
 */
@WebServlet("/student/studentall.do")
public class selectAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selectAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DB의 web게정의 student테이블의 전체 데이터를 가져와 응답해주는 기술
		
//		int cPage=Integer.parseInt(request.getParameter("cPage"));
//		int numPerpage=Integer.parseInt(request.getParameter("numPerpage"));
//		
		int cPage;
		try {
			cPage=Integer.parseInt(request.getParameter("cPage"));
		} catch (NumberFormatException e) {
			cPage=1;
		}
		int numPerpage;
		try {
			numPerpage=Integer.parseInt(request.getParameter("numPerpage"));
		} catch (NumberFormatException e) {
			numPerpage=5;
		}
	
		
		
		List<Student> students = new StudentService().studentAll(cPage,numPerpage);

		
		//저장 request에 저장
		request.setAttribute("students", students);
		
		//pageBar만들기
		int totalData=new StudentService().selectStudentCount();
		int totalPage=(int)Math.ceil((double)totalData/numPerpage);
		int pageBarSize=5;
		int pageNo=((cPage-1)/pageBarSize)*pageBarSize+1;
		int pageEnd=pageNo+pageBarSize-1;
		
		//요청을 보내는 html생성
		String pageBar="";
		if(pageNo==1) {
			pageBar+="<span>[이전]</span>";
		}else {
			pageBar+=",a href='"+request.getRequestURI()
				+"?cPage="+(pageNo-1)+"&numPerpage="+numPerpage+"'>[이전]</a>";
		}
		while(!(pageNo>pageEnd||pageNo>totalPage)) {
			if(pageNo==cPage) {
				pageBar="<span>"+pageNo+"</span>";
			}else {
				pageBar+="<a href='"+request.getRequestURI()
				+"?cPage="+pageNo+"&numPerpage="+numPerpage
				+"'>"+pageNo+"</a>";
			}
			pageNo++;
		}
		if(pageNo>totalPage) {
			pageBar+="<span>[다음]</span>";
		}else {
			pageBar+="<a href='"+request.getRequestURI()
			+"?cPage="+pageNo+"&numPerpage="+numPerpage
			+"'>[다음]</a>";
		}
		request.setAttribute("pageBar", pageBar);
		
		//students를 출력할 jsp에 전달
		RequestDispatcher rd = request.getRequestDispatcher("/views/student/studentlist.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
