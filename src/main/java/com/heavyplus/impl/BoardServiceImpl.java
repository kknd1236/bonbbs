package com.heavyplus.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heavyplus.dao.BoardDAO;
import com.heavyplus.dto.BoardDTO;
import com.heavyplus.dto.PageDTO;
import com.heavyplus.service.BoardService;

@Service
@Transactional(readOnly = true)
public class BoardServiceImpl implements BoardService {

	private final BoardDAO boardDAO;

	@Autowired
	public BoardServiceImpl(SqlSession sqlSession) {
		this.boardDAO = sqlSession.getMapper(BoardDAO.class);
	}

	@Override
	public void regist(BoardDTO board) throws Exception {
		boardDAO.create(board);
	}

	@Override
	public BoardDTO read(Long documentId) throws Exception {
		return boardDAO.read(documentId);
	}

	@Override
	public void modify(BoardDTO board) throws Exception {
		boardDAO.update(board);
	}

	@Override
	public void remove(Long documentId) throws Exception {
		boardDAO.delete(documentId);
	}

	@Override
	public PageDTO<BoardDTO> listAll(PageDTO<BoardDTO> boardPage) throws Exception {
	    boardPage.setContentList(boardDAO.listAll(boardPage));
	    boardPage.setTotalSize(boardDAO.getCount());
		return boardPage;
	}

}