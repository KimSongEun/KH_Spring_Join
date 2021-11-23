package com.mycompany.testpractice.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.testpractice.member.model.dao.MemberDAO;
import com.mycompany.testpractice.member.model.vo.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO memberDao;

	@Override
	public int signUp(Member m) throws Exception {
		return memberDao.signUp(m);
	}
	
	
}
