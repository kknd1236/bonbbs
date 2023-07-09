package com.heavyplus.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heavyplus.dao.GroupDAO;
import com.heavyplus.dto.GroupDTO;
import com.heavyplus.service.GroupService;

@Service
@Transactional(readOnly = true)
public class GroupServiceImpl implements GroupService {

	private final GroupDAO groupDAO;

	@Autowired
	public GroupServiceImpl(SqlSession sqlSession) {
		this.groupDAO = sqlSession.getMapper(GroupDAO.class);
	}

	@Override
	public void regist(GroupDTO group) throws Exception {
		groupDAO.create(group);
	}

	@Override
	public GroupDTO read(Long groupId) throws Exception {
		return groupDAO.read(groupId);
	}

	@Override
	public void modify(GroupDTO group) throws Exception {
		groupDAO.update(group);
	}

	@Override
	public void remove(Long groupId) throws Exception {
		groupDAO.delete(groupId);
	}

	@Override
	public List<GroupDTO> listAll() throws Exception {
		return groupDAO.listAll();
	}

}