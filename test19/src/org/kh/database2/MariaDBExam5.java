package org.kh.database2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MariaDBExam5 {

	public static void main(String[] args) {
		Connection con = null; //연결
		PreparedStatement pstmt = null;//상태 변경(ON/OFF)하고, SQL의 문장을 실행
		ResultSet rs = null;
		MariaDB maria = new MariaDB();
		String sql = "select * from student";
		List<Student> stList = new ArrayList<>();
		
		try {
			con = maria.connect();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				Student st = new Student(rs.getInt("no"),rs.getString("name"), rs.getInt("point"));
				stList.add(st);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			maria.close(rs, pstmt, con);
		}
		
		for(Student s : stList)
		{
			System.out.println(s.toString());
		}

	}

}
