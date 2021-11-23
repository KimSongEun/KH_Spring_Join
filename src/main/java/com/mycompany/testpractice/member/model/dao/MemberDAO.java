package com.mycompany.testpractice.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.testpractice.member.model.vo.Member;

@Repository("memberDao")
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public int signUp(Member m) throws Exception {
		return sqlSession.insert("Member.signUp", m);
	}
}
