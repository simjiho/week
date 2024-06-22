package com.web.board.service;

import static com.web.common.SessionTemplate.getSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.board.dao.boardDao;
import com.web.board.dto.Board;

public class BoardService {
	private boardDao dao = new boardDao();
	public List<Board> selectBoardAll(){
		SqlSession session = getSession();
		List<Board> result = dao.selectBoardAll(session);
		session.close();
		return result;
	}
}
