package com.heavyplus.service;

import java.util.List;

import com.heavyplus.dto.CategoryDTO;
import com.heavyplus.dto.CommentDTO;

public interface CommentService {

	  public void regist(CommentDTO comment) throws Exception;

	  public CommentDTO read(Long commentId) throws Exception;

	  public void modify(CommentDTO comment) throws Exception;

	  public void remove(Long commentId) throws Exception;

	  public List<CommentDTO> listAll() throws Exception;

	  public long getCommentId() throws Exception;

	  public long getDocumentId() throws Exception;

}