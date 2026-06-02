package com.acorn.prac.batis;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )

public class MemberRepositoryTest2 {

	@Autowired
	MemberRepository repository;
	
//	@Test
//	public void test() throws Exception {
////		fail("Not yet implemented");
//		repository.selectAll();
//		
//		List<Member> list = repository.selectAll();
//		list.stream().forEach(m -> System.out.println(m));
//		
//		assertTrue(list.size() >=1);
//	}
	
	@Test
	public void test() throws Exception {
//		fail("Not yet implemented");
		Member m = new Member();
		m.setId("id1");
		m.setName("name");
		m.setPwd("1234");
		
		int rowCnt = repository.insert(m);
		
		assertTrue(rowCnt ==1);
	}

}
