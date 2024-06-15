package com.web.member.service;

import com.web.member.dao.MemberDao;
import com.web.member.dto.Member;
import org.apache.ibatis.session.*;
import static com.web.common.SessionTemplate.getSession;

public class MemberService {
	private MemberDao dao=new MemberDao();
	
	public Member selectMemberById(String userId) {
		SqlSession session=getSession();
		Member m=dao.selectMemberById(session,userId);
		session.close();
		return m;
	}
	public int insertMember(Member m) {
		SqlSession session = getSession();
		int result = dao.insertMember(session, m);
		if(result > 0) session.commit();
		else session.rollback();
		session.close();
		return result;
		}
	}
