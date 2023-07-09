package com.heavyplus.service;

import java.util.List;

import com.heavyplus.dto.CategoryDTO;

public interface CategoryService {

	  public void regist(CategoryDTO category) throws Exception;

	  public CategoryDTO read(Long categoryId) throws Exception;

	  public void modify(CategoryDTO category) throws Exception;

	  public void remove(Long categoryId) throws Exception;

	  public List<CategoryDTO> listAll() throws Exception;

}