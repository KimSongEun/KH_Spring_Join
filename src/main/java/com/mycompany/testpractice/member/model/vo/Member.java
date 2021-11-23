package com.mycompany.testpractice.member.model.vo;

import java.sql.Date;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private Date memberEnrollDt;
	
	public Member() {
		super();
	}

	public Member(String memberId, String memberPwd, String memberName, Date memberEnrollDt) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberEnrollDt = memberEnrollDt;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberEnrollDt=" + memberEnrollDt + "]";
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Date getMemberEnrollDt() {
		return memberEnrollDt;
	}

	public void setMemberEnrollDt(Date memberEnrollDt) {
		this.memberEnrollDt = memberEnrollDt;
	}
	
	
	
}
