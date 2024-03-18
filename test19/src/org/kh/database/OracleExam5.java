package org.kh.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam5 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		OracleDB oracle = new OracleDB();
		String sql = "select * from student";
		List<Student> stList = new ArrayList<>();
	
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				Student st = new Student(rs.getInt("no"),rs.getString("name"),rs.getInt("point"));
				stList.add(st);
			}		
		} catch (SQLException e) {	
			e.printStackTrace();
		}finally {
			oracle.close(rs, pstmt, con);
		}
		
		for(Student s : stList)
		{
			System.out.println(s.toString());
		}
		
		con = null;
		pstmt = null;
		Student std = new Student(7,"차두리",50);
		sql = "insert into student(no, name, point) values(?,?,?)";
		int i=0;
	
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, std.getNo());
			pstmt.setString(2, std.getName());
			pstmt.setInt(3, std.getPoint());
			i = pstmt.executeUpdate();
			if(i>0)
			{
				System.out.println(i+"건이 정상적으로 추가되었습니다.");
			}else {
				System.out.println("SQL 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
			e.printStackTrace();
		}finally {
			oracle.close(pstmt, con);
		}	
		
		std = new Student(6,"조빈",100);
		con=null;
		pstmt=null;
		sql="update student set name=?,point=? where no=?";
		i=0;
		
		try {
			con = oracle.connect();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, std.getName());
			pstmt.setInt(2, std.getPoint());
			pstmt.setInt(3, std.getNo());
			i = pstmt.executeUpdate();
			if(i>0)
			{
				System.out.println(i+"건이 정상적으로 변경되었습니다.");
			}else {
				System.out.println("SQL 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
			e.printStackTrace();
		}finally {
			oracle.close(pstmt, con);
		}
		
		int bun =4;
		con=null;
		pstmt=null;
		sql="delete from student where no=?";
		i=0;
	
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bun);
			i = pstmt.executeUpdate();
			if(i>0)
			{
				System.out.println(i+"건이 정상적으로 삭제되었습니다.");
			}else {
				System.out.println("SQL 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
			e.printStackTrace();
		}finally {
			oracle.close(pstmt, con);
		}
	}
}
