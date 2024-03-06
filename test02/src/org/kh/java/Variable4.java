package org.kh.java;

public class Variable4 {

	public static void main(String[] args) {
		String name = "김동연";
		short age = 33;
		float height = 170.7f;
		double weight = 98.3;
		char init = 'k';
		
		System.out.println("이름 : \""+name+"\"");
		System.out.printf("%n이름 : \"%s\"",name);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f", height);
		System.out.printf("%n체중 : %.3f", weight);
		System.out.println("\n이니셜 : "+ init);
		/* 이스케이프 문자
		 \n : 줄바꿈
		 \t : 탭
		 \\ : \를 출력
		 \" : "를 출력
		 \' : '를 출력 
		 */
	}

}
