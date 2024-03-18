package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;

public class MemberExam {
	List<Member> memList = new ArrayList<>();
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.mainCall();

	}
	//메뉴에 반복 호출하고, 키보드에서 각 해당 번호를 누르면 각 작업이 이루어 질 수 있도록 하시오.
	public void mainCall() {//1.회원가입, 2. 회원목록, 3. 회원 삭제, 4.프로그램 종료
		Scanner scn = new Scanner(System.in);
		int i=1;
		while(true)
		{
			System.out.println("1. 회원가입");
			System.out.println("2. 회원목록");
			System.out.println("3. 회원삭제");
			System.out.println("4. 프로그램 종료");
			System.out.println("번호 입력 : ");
			int a = scn.nextInt();
			
			switch(a)
			{
				case 1: 
				{
					System.out.print("아이디 입력 : ");
					String id = scn.next();
					System.out.println("이름 입력 : ");
					String name = scn.next();
					System.out.println("비밀번호 입력");
					String pw = scn.next();
					System.out.println("생년 입력 : ");
					int year = scn.nextInt();
					System.out.println("전화번호 입력");
					String tel = scn.next();
					
					
					Member mem = new Member(i, id, pw, name, year, tel);
					
					
				}
			}
			
		}
	}

}
