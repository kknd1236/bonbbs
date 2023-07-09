package com.heavyplus.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {

	private Long memberId;

	private String password;

	private String email;

	private String name;

	private String nickName;

	private Long groupId;

	private GroupDTO group;

	private Date createDate;

	private Date lastLogin;

}