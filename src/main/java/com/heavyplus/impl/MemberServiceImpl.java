package com.heavyplus.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.heavyplus.dao.MemberDAO;
import com.heavyplus.dto.MemberDTO;
import com.heavyplus.service.MemberService;

@Service
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService {

	private final MemberDAO memberDAO;

	@Autowired
	public MemberServiceImpl(SqlSession sqlSession) {
		this.memberDAO = sqlSession.getMapper(MemberDAO.class);
	}

	@Override
	public void regist(MemberDTO member) throws Exception {
		memberDAO.create(member);
	}

	@Override
	public MemberDTO read(Long memberId) throws Exception {
		return memberDAO.read(memberId);
	}

	@Override
	public void modify(MemberDTO member) throws Exception {
		memberDAO.update(member);
	}

	@Override
	public void remove(Long memberId) throws Exception {
		memberDAO.delete(memberId);
	}

	@Override
	public List<MemberDTO> listAll() throws Exception {
		return memberDAO.listAll();
	}

}