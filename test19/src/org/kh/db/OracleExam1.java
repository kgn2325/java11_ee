package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam1 {

	public static void main(String[] args) {
		Connection con = null; //연결
		PreparedStatement pstmt = null;//상태 변경(ON/OFF)하고, SQL의 문장을 실행
		ResultSet rs = null;//검색(Select문)의 결과를 반환받음
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql ="select * from student";
		List<Student> stList = new ArrayList<>();
		
		try {
			Class.forName(driver); //현재 클래스에 드라이버 로딩
			try {
				con = DriverManager.getConnection(url,userid, userpw);//데이터베이스 물리적인 연결
				pstmt = con.prepareStatement(sql);//논리적인 채널 연결
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Student st = new Student(rs.getInt("no"),rs.getString("name"),rs.getInt("point"));
					stList.add(st);	
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 구문 실행 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("데이터베이스 로딩 실패");
			e.printStackTrace();
		}finally {
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		for(Student s : stList)
		{
			System.out.println(s.toString());
		}

	}

}
