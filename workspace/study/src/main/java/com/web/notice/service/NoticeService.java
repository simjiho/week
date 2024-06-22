package com.web.notice.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import static com.web.common.SessionTemplate.getSession;

import com.web.notice.dao.NoticeDao;
import com.web.notice.dto.NoticeDto;

public class NoticeService {
	private NoticeDao dao = new NoticeDao();
	public List<NoticeDto> selectNoticeAll(){
		SqlSession session = getSession();
		List<NoticeDto> result = dao.selectNoticeAll(session);
		session.close();
		return result;
	}
}
