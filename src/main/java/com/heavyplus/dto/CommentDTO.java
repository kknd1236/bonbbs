package com.heavyplus.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDTO extends BaseTime {

	private Long commentId;

	private Long documentId;

	private String content;

	private Long likeCount;

	private Long dislikeCount;

	private Long memberId;

	private BoardDTO board;

	private MemberDTO member;

	public Long getCommentId;
	
	public Long getDocumentId;
	
}
