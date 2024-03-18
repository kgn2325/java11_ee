package org.kh.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//insert into 테이블명[(필드명1, 필드명2,...)] values(값1,값2,...) : 테이블에 레코드를 추가
public class OracleExam2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "system";
		String userpw = "1234";
		String sql ="insert into student values(?,?,?)";
		Student st = new Student(6,"이승우",70);
		int i;
		try {
			Class.forName(driver);//드라이버 로딩
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);//전원 ON
				pstmt.setInt(1, st.getNo());//쿼리 옵션 추가
				pstmt.setString(2, st.getName());
				pstmt.setInt(3, st.getPoint());
				i = pstmt.executeUpdate();//commit명령이 포함되어 있음 => update, delete, insert일때 사용 //SQL 실행 및 결과 반환
				if(i>0)
				{
					System.out.println(i+"건이 성공적으로 처리 되었습니다.");
				}else {
					System.out.println("SQL 구문 실패");
				}
			}catch(SQLException e)
			{
				System.out.println("데이터베이스 연결 실패 또는 SQL 구문 실행 실패");
				e.printStackTrace();
			}			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}finally {
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
	}
}
