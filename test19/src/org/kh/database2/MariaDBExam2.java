package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariaDBExam2 {

	public static void main(String[] args) {
		Connection con = null; //연결
		PreparedStatement pstmt = null;//상태 변경(ON/OFF)하고, SQL의 문장을 실행
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		Student newSt = new Student(6,"kim",95);
		String sql = "insert into student values(?,?,?)";
		int i=0;
		
		//MariaDB의 temp 데이터베이스의 student 테이블의 nesSt의 내용을 레코드를 추가되도록
		//자바 프로그래밍을 완성하시오.
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1,  newSt.getNo());
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				i = pstmt.executeUpdate();
				if(i>0)
				{
					System.out.println("성공적으로 업데이트 되었습니다.");
				}else {
					System.out.println("업데이트 실패");
				}
			} catch (SQLException e) {
				System.out.println("SQLException ");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		}finally {
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
