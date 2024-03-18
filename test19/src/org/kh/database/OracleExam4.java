package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//delete from 테이블명[where 필드명=값] : 테이블의 특정 조건에 맞는 레코드 삭제
public class OracleExam4 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql ="delete from student where no=?";
		//String sql ="delete from student where name=?";
		//String sql ="delete from student where point=?";
		Student st = new Student(5,"손흥민",98);
		int i=0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid,userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, st.getNo());
				//pstmt.setString(1, st.getName());
				//pstmt.setInt(1, st.getPoint());//point가 98점인 학생 찾아서 다 삭제
				i=pstmt.executeUpdate();
				if(i>0)
				{
					System.out.println(i+"건이 정상적으로 처리되었습니다.");
				}else {
					System.out.println("SQL 처리 실패");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("데이터 베이스 로딩 실패");
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
