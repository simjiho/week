package com.web.member.dao;

import org.apache.ibatis.session.SqlSession;

import com.web.member.dto.Member;
public class MemberDao {
	
	public Member selectMemberById(SqlSession session,
			String userId) {
		return session.selectOne("member.selectMemberById",userId);
	}
	public int insertMember(SqlSession session, Member m) {
		return session.insert("member.insertMember",m);
	}
}
