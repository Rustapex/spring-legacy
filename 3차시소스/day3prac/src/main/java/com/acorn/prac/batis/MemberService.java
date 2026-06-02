package com.acorn.prac.batis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository repository;
	
	public List<Member> getMemberList() throws Exception{
		return repository.selectAll();
	};
	
	public int registerMember(Member member) {
		return repository.insert(member);
	}

}
