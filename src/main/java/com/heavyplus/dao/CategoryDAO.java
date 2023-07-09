package com.heavyplus.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.heavyplus.dto.CategoryDTO;

@Repository("CategoryDAO")
public interface CategoryDAO {

	public void create(CategoryDTO category) throws Exception;

	public CategoryDTO read(Long categoryId) throws Exception;

	public void update(CategoryDTO category) throws Exception;

	public void delete(Long categoryId) throws Exception;

	public List<CategoryDTO> listAll() throws Exception;

}