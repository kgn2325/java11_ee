package test;

public class Exam5 {

	public static void main(String[] args) {
		try {
			//1. url이 잘못되어 db 연결 할수 없다. url의 데이터베이스 이름이 없다 조치사항 뒤에 /kh추가
			//2. query 실행문이 없으므로 query가 실행되지 못한다. 
			// 위에 String query = select emp_id, emp_name from employee;
			//3. Application클래스의 ResultSet rs = st.executeUpdate() 문장에서 executeUpdate() 메소드는 int를 반환하므로 해당 검색 결과인 ResultSet을 반환 받을 수 없다. 
			// executeQuery()로 변경
			//4. Application클래스의 while(rs)문장에서 rs는 다음 레코드를 지칭해야 레코드가 끝날 때까지 반복수행 할 수 없으므로  진행되지 못한다,
			// rs.next()로 변경
			//5. System.out.println(rs.getString("empID" +"/" +rs.getString(empName)); 문장에서 empID와 empName 컬럼이 존재하지 않으므로 해당 컬럼을 접근을 할 수 없다.
			//6. 
			
		}catch(Exception e)
		{
			
		}

	}

}
