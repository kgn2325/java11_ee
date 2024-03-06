package org.kh.java;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] memberArr = {"홍길동", "김성훈", "윤웅식", "윤성우", "남궁인"};
		System.out.print("검색할 회원 이름을 입력하세요 : ");
		String searchName = sc.nextLine();
		boolean result = false;
		boolean s = (memberArr[4]==searchName);
		int j1=4;
		int j=4;
		boolean k = (j1==j);
		String s1 = "김기태";
		String s2 = "김기태";
		boolean s3 = (s1==s2);
		System.out.println(s+", "+k);
		
		for(int i = 0; i< memberArr.length; i++)
		{
			
			if(memberArr[4].equals(searchName))
			{
				
				result = true;
				break;
			}
		}
		
		if(result)
		{
			System.out.println("회원이 존재합니다.");
		}else {
			System.out.println("회원이 존재하지 않습니다.");
		}

	}

}
