package com.acorn.prac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class 오징어DAO {

    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:testdb";
    String user = "scott";
    String password = "tiger";

    // DB 연결만 담당하는 메서드
    public Connection dbCon() {
        Connection con = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    // 전체 조회 메서드
    public ArrayList<오징어> selectAll() {

        ArrayList<오징어> list = new ArrayList<오징어>();

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = dbCon();

            String sql = "select * from member_tbl_11";
            pst = con.prepareStatement(sql);

            // 여기가 중요함
            rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString(1);
                String pw = rs.getString(2);
                String name = rs.getString(3);

                오징어 o = new 오징어();
                o.setM_id(id);
                o.setM_pw(pw);
                o.setM_name(name);

                list.add(o);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    public static void main(String[] args) {
        오징어DAO dao = new 오징어DAO();

        ArrayList<오징어> list = dao.selectAll();

        list.forEach(o -> System.out.println(o));
    }
}