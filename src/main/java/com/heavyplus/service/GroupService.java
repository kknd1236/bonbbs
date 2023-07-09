package com.heavyplus.service;

import java.util.List;

import com.heavyplus.dto.GroupDTO;

public interface GroupService {

	  public void regist(GroupDTO group) throws Exception;

	  public GroupDTO read(Long groupId) throws Exception;

	  public void modify(GroupDTO group) throws Exception;

	  public void remove(Long groupId) throws Exception;

	  public List<GroupDTO> listAll() throws Exception;

}