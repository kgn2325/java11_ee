package org.kh.object1;
//회원(Member)클래스를 작성하되, 아이디(id), 비밀번호(pw), 이메일(email), 생년(birth), 전화번호(tel)
//등을 요소로 하고, 회원정보를 출력하는 메서드를 작성하시오,
//public      > protected > default> private  => 객체지향의 특징 중 1개 정보은닉
//모든패키지나 클래스 동일/상속/연관  동일패키지   현재클래스
public class Member {
	private String id;
	private String pw; 
	private String email; 
	private String tel;
	private int birth;
	
	
	public void setId(String id) { // ()안 => 매개변수 :메서드나 생성자에 전달되는 값을 받아들이는 변수입니다.  
		this.id = id;              // 메서드나 생성자를 호출할 때 전달하는 값은 매개변수를 통해 메서드나 생성자 내에서 사용될 수 있습니다.
	}                              // 매개변수는 해당 메서드나 생성자가 호출될 때마다 다양한 값을 전달하여 다양한 동작을 수행할 수 있도록 합니다.


	public void setPw(String pw) {
		this.pw = pw;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}


	public String getEmail() {
		return email;
	}


	public String getTel() {
		return tel;
	}


	public int getBirth() {
		return birth;
	}


	@Override//상속 받아서 내용을 바꿔서 정의하는 것(슈퍼클래스(부모 클래스)에 정의된 메서드를 서브클래스(자식 클래스)에서 다시 정의하는 것을 말합니다. 
	         //이렇게 하면 서브클래스에서 슈퍼클래스의 메서드를 재정의하여 해당 메서드의 동작을 변경할 수 있습니다.)
	public String toString() {//toString() object(최상단, 조상) 클래스에 존재 메소드는 private 걸일이 없다
		return "Member [id=" + id + ", pw=" + pw + ", email=" + email + ", tel=" + tel + ", birth=" + birth + "]";
	}
	
	
}
