package com.web.board.dto;

public class Board {
	
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private String boardContent;
	private String boardOriginalFilename;
	private String boardRenamedFilename;
	private String boardDate;
	private String boardReadcount;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Board(int boardNo, String boardTitle, String boardWriter, String boardContent, String boardOriginalFilename,
			String boardRenamedFilename, String boardDate, String boardReadcount) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardContent = boardContent;
		this.boardOriginalFilename = boardOriginalFilename;
		this.boardRenamedFilename = boardRenamedFilename;
		this.boardDate = boardDate;
		this.boardReadcount = boardReadcount;
	}



	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardOriginalFilename() {
		return boardOriginalFilename;
	}

	public void setBoardOriginalFilename(String boardOriginalFilename) {
		this.boardOriginalFilename = boardOriginalFilename;
	}

	public String getBoardRenamedFilename() {
		return boardRenamedFilename;
	}

	public void setBoardRenamedFilename(String boardRenamedFilename) {
		this.boardRenamedFilename = boardRenamedFilename;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardReadcount() {
		return boardReadcount;
	}

	public void setBoardReadcount(String boardReadcount) {
		this.boardReadcount = boardReadcount;
	}
	
}