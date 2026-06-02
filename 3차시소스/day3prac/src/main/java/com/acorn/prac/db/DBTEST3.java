package com.acorn.prac.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



public class DBTEST3 {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext ac = new GenericApplicationContext();
		
		DataSource ds = ac.getBean(DataSource.class);
		Connection con = ds.getConnection();
		
		
		System.out.println(con);
		
		String sql = "select * from member_tbl_11";
		PreparedStatement pst = con.prepareStatement(sql);
		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
		
		
	}

}
