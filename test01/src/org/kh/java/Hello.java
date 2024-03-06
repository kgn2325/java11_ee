package org.kh.java;

public class Hello {

	public static void main(String[] args) { //실행을 위한 기본 main 메소드
		int age;
		age = 33;
		System.out.println("Hello~! \nJAVA~!");
		/*
		    자기이름 소개하는
		    출력 명령
		    결과 : My name is DongYeon
		 */
		System.out.println("My Name is DongYeon"); // ctrl + / = 지정 한줄 주석 처리 다시 하면 해제 ctrl + shift + / = 여러줄 주석 이거는 해제는 안된다
		// sysout = > Ctrl + Spacebar = 단축명령 자동 완성(Code Hinting) 
		for(int i = 0; i<9; i++)
		{
			if(i<5)
			{
				for(int j = 5; j>i; j--)
				{
					System.out.print("*");
				}
				for(int k = 0; k<2*i+1; k++)
				{
					System.out.print(" ");
				}
				for(int j = 5; j>i; j--)
				{
					System.out.print("*");
				}
				System.out.println(); 
				
			}else {
				for(int j = 3; j<i; j++)
				{
					System.out.print("*");
				}
				for(int k = 18; k>2*i+1; k--)
				{
					System.out.print(" ");
				}
				for(int j = 3; j<i; j++)
				{
					System.out.print("*");
				}
				System.out.println(); 
			}
		}
		
		
	}

}
