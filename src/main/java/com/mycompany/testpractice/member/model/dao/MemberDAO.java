package com.mycompany.testpractice.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.testpractice.member.model.vo.Member;

@Repository("memberDao")
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate SqlSessionTemplate;
	
	// Statement 실행하기 위해 sqlsession
	// Member.signUp // insert
	public int signUp(Member m) throws Exception {
		return SqlSessionTemplate.insert("Member.signUp", m);
	}
}
