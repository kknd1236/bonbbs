package com.heavyplus.service;

import java.util.List;

import com.heavyplus.dto.BoardDTO;
import com.heavyplus.dto.PageDTO;

public interface BoardService {

	  public void regist(BoardDTO board) throws Exception;

	  public BoardDTO read(Long documentId) throws Exception;

	  public void modify(BoardDTO board) throws Exception;

	  public void remove(Long documentId) throws Exception;

	  // public List<BoardDTO> listAll() throws Exception;
	  public PageDTO<BoardDTO> listAll(PageDTO<BoardDTO> boardPage) throws Exception;

}