package com.heavyplus.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO extends BaseTime {
	private Long categoryId;
	private String category;
}
