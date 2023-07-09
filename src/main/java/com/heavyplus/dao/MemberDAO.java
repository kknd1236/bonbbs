package com.heavyplus.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.heavyplus.dto.MemberDTO;

@Repository("MemberDAO")
public interface MemberDAO {

	public void create(MemberDTO member) throws Exception;

	public MemberDTO read(Long memberId) throws Exception;

	public void update(MemberDTO member) throws Exception;

	public void delete(Long memberId) throws Exception;

	public List<MemberDTO> listAll() throws Exception;

}