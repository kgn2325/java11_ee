package org.kh.object1;

public class Compute01 {
	void fnc1()  // 반환(x), 매개변수(x)
	{
		System.out.println("메소드(함수1)");
	}
	void fnc2(int a)//반환(x), 매개변수(o)
	{
		System.out.println(a+ "를 입력하셨습니다.");
	}
	
	int fnc3()//반환(o), 매개변수(x)
	{
		return 1004;
	}
	String fnc4(int point)//반환(o), 매개변수(o)
	{
		if(point>=80)
		{
			return "합격";		
		}else
		{
			return "불합격";
		}
	}
	
	int fnc5(int a, int b)
	{
		return a+b;
	}
	String fnc6()
	{
		return "안녕하세요"; 
	}
	void fnc7()
	{
		System.out.println("안녕하세요 잘있어요.");
	}
	
	void fnc8(int a, int b)
	{
		System.out.println("a-b : "+ (a-b));
	}

}
