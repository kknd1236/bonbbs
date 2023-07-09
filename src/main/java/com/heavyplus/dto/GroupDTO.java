package com.heavyplus.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroupDTO extends BaseTime {
	private Long groupId;
	private String groupName;
}