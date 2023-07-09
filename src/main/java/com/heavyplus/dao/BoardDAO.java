package com.heavyplus.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.heavyplus.dto.BoardDTO;
import com.heavyplus.dto.PageDTO;

@Repository("BoardDAO")
public interface BoardDAO {
	
	/*
	 * public void create(BoardDTO board) throws Exception;
	 * public BoardDTO read(Long documentId) throws Exception;
	 * public void update(BoardDTO board) throws Exception;
	 * public void delete(Long documentId) throws Exception;
	 * public List<BoardDTO> listAll() throws Exception;
	*/
	
	public void delete(Long documentId) throws Exception;

	public List<BoardDTO> listAll(PageDTO<BoardDTO> boardPage) throws Exception;

	public void create(BoardDTO board) throws Exception;

	public BoardDTO read(Long documentId) throws Exception;

	public void update(BoardDTO board) throws Exception;

	public Long getCount() throws Exception;
	
	public Long getDocumentId() throws Exception;

}