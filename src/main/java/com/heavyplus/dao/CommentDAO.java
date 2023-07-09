package com.heavyplus.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.heavyplus.dto.CommentDTO;

@Repository("CommentDAO")
public interface CommentDAO {

	public void create(CommentDTO comment) throws Exception;

	public CommentDTO read(Long commentId) throws Exception;

	public void update(CommentDTO comment) throws Exception;

	public void delete(Long commentId) throws Exception;

	public List<CommentDTO> listAll() throws Exception;
	
	public Long getCommentId() throws Exception;
	
	public Long getDocumentId() throws Exception;

}