package org.kh.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class Student {
	private int no;
	private String name;
	private int point;
	public Student() {}
	public Student(int no, String name, int point) {
		this.no = no;
		this.name = name;
		this.point = point;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Stduent [no=" + no + ", name=" + name + ", point=" + point + "]";
	}
}
public class OracleExam {
	public static void main(String[] args) throws SQLException  {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		OracleDB oracle1 = new OracleDB();
	
		con = oracle1.connect();	//Connection -> Oracle 연결
		String sql = "select * from student";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		if(rs==null) {
			System.out.println("확인");
		}
		
		List<Student> stList = new ArrayList<Student>();
		
		while(rs.next()) {
			Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
			stList.add(st);
		}
		oracle1.close(con, pstmt, rs);
		
		for(Student s:stList) {
			System.out.println(s.toString());
		}
		
		
	}
}
