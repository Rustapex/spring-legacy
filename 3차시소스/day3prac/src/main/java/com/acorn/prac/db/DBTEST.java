package com.acorn.prac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBTEST {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "scott";
		String password = "tiger";

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		ArrayList<오징어> list = new ArrayList<오징어>();

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

			String sql = "select * from member_tbl_11";
			pst = con.prepareStatement(sql);

			pst.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);

				오징어 o = new 오징어();
				o.setM_id(id);
				o.setM_name(name);
				o.setM_pw(pw);

				list.add(o);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		list.forEach(oj -> System.out.println(oj));
	}

}
