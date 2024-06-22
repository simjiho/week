package com.web.notice.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.notice.dto.NoticeDto;

public class NoticeDao {
	public List<NoticeDto> selectNoticeAll(SqlSession session){
		return session.selectList("notice.selectNoticeAll");
	}
}
