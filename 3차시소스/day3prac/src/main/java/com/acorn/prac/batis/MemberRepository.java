package com.acorn.prac.batis;

 

import java.util.HashMap;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 


@Repository
public class MemberRepository  {
    @Autowired
    private SqlSession session;
    
    
    
    private static String namespace = "com.acorn.MemberMapper.";
      
   
    public List<Member> selectAll() throws Exception {
        return session.selectList(namespace+"selectAll");
    } // List<E> selectList(String statement)
    
    public int insert(Member member) {
    	return session.insert(namespace+"insert", member);
    }
   

}
 