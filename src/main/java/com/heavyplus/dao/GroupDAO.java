package com.heavyplus.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.heavyplus.dto.GroupDTO;

@Repository("GroupDAO")
public interface GroupDAO {

	public void create(GroupDTO group) throws Exception;

	public GroupDTO read(Long groupId) throws Exception;

	public void update(GroupDTO group) throws Exception;

	public void delete(Long groupId) throws Exception;

	public List<GroupDTO> listAll() throws Exception;

}