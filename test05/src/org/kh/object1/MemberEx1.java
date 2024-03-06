package org.kh.object1;

public class MemberEx1 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("kim");
		mem1.setPw("1234");
		mem1.setEmail("kim@naver.com");
		mem1.setBirth(1992);
		mem1.setTel("010-1234-5678");
		System.out.println(mem1.toString());
		System.out.println("Id : "+mem1.getId());
		System.out.println("Pw : "+mem1.getPw());
		System.out.println("Email : "+mem1.getEmail());
		System.out.println("Birth : "+mem1.getBirth());
		System.out.println("Tel : "+mem1.getTel());
		

	}

}
