package com.heavyplus.service;

import java.util.List;

import com.heavyplus.dto.MemberDTO;

public interface MemberService {

	  public void regist(MemberDTO member) throws Exception;

	  public MemberDTO read(Long memberId) throws Exception;

	  public void modify(MemberDTO member) throws Exception;

	  public void remove(Long memberId) throws Exception;

	  public List<MemberDTO> listAll() throws Exception;

}