package com.heavyplus.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO extends BaseTime {

	private Long documentId;
	
	private Long categoryId;

	private Boolean isNotice;

	private String title;

	private String content;

	private Long likeCount;

	private Long dislikeCount;

	private Long readCount;

	private Long memberId;

	private Long groupId;

	private List<CommentDTO> commentList;

	private CategoryDTO category;

	private MemberDTO member;

	private GroupDTO group;
	
	public Long getDocumentId;


}