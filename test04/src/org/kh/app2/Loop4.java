package org.kh.app2;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		/*
		  for(초기식; 조건식; 증감식)와 마찬가지로 조건이 만족하는 동안만 반복수행
		  그러나 while의 괄호에 조건만 기입하고, 해당 블록 안에 증감식이 기재됨.
		  초기식은 while문 시작전에 해야함.
		  초기식;
		  while(조건식){
		  		증감식;
		  		반복할문장;
		  }
		 */
		int i = 0, tot = 0;
		while(i<=5) 
		{
			i++;
			tot+=i;
		}
		System.out.println("결과 : "+tot);
		
		//해당 숫자를 입력하면 ,해당 숫자의 단을 출력하시오.
		
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자 입력[2-9] : ");
		int a = scn.nextInt();
		int j = 1;
		while(j<10)
		{
			System.out.println(a+" * "+j+" = " + (a*j));
			j++;
		}
		System.out.println();
		for(int k = 1; k<10; k++)
		{
			System.out.println(a+" * "+k+" = " + (a*k));
		}

	}

}
