package com.heavyplus.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heavyplus.dao.CommentDAO;
import com.heavyplus.dto.CommentDTO;
import com.heavyplus.service.CommentService;

@Service
@Transactional(readOnly = true)
public class CommentServiceImpl implements CommentService {

	private final CommentDAO commentDAO;

	@Autowired
	public CommentServiceImpl(SqlSession sqlSession) {
		this.commentDAO = sqlSession.getMapper(CommentDAO.class);
	}

	@Override
	public void regist(CommentDTO comment) throws Exception {
		commentDAO.create(comment);
	}

	@Override
	public CommentDTO read(Long commentId) throws Exception {
		return commentDAO.read(commentId);
	}

	@Override
	public void modify(CommentDTO comment) throws Exception {
		commentDAO.update(comment);
	}

	@Override
	public void remove(Long commentId) throws Exception {
		commentDAO.delete(commentId);
	}

	@Override
	public List<CommentDTO> listAll() throws Exception {
		return commentDAO.listAll();
	}
	
	@Override
	public long getCommentId() throws Exception {
		return commentDAO.getCommentId();
	}
	
	@Override
	public long getDocumentId() throws Exception {
		return commentDAO.getDocumentId();
	}

}