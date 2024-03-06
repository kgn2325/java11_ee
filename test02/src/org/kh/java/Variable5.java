package org.kh.java;

public class Variable5 {

	public static void main(String[] args) {
		char ch1 = 'H';
		char ch2 = 65;
		char ch3 = 97;
		char ch4 = '\u2665';// '\\u 유니코드<- 오류걸려서 \개더붙힘 원래 1개
		//char ch5 = -65;  코드넘버는 순번이므로 음수값을 가질 수 없다. 그래서 에러 발생
		char ch5 = 121;
		char ch6 = '\u26BD';
		System.out.println("ch1 : "+ch1);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		System.out.println("ch4 : "+ch4);
		System.out.println("ch5 : "+ch5);
		System.out.println("ch6 : "+ch6);
		
		System.out.println("아스키 코드 넘버");
		System.out.println("ch1 : " + (int)ch1);// 강제 형변환 문자형->정수형
		System.out.println("ch2 : " + (int)ch2);
		System.out.println("ch3 : " + (int)ch3);
		System.out.println("ch4 : " + (int)ch4);
		System.out.println("ch5 : " + (int)ch5);
		System.out.println("ch6 : " + (int)ch6);
		
	}

}
