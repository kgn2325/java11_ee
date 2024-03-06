package org.kh.app;

import java.util.Scanner;

// 조건문 다단계if
public class Condition4 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력[0~100] : ");
		int point = scan.nextInt();
		String result;
		String price;
		
		/* 학점(result)은 점수(point)가
		   97~100이면 'A++' , 93~96 'A0', 90~92이면, 'A-',
		   87~89이면 'B++' , 83~86 'B0', 80~82이면, 'B-',
		   77~79이면 'C++' , 73~76 'C0', 70~72이면, 'C-',
		   67~69이면 'D++' , 63~66 'D0', 60~62이면, 'D-',
		   60점 미만이면 'F'로 하되, 다단계 if와 if/elseif/else문 활용
		   시상내용은 학점이 A++이면, '학업우수상', 'A0'이면, '노력상',
		   'A-'이면, '아차상'으로 하고, 나머지는 ''으로 하되, switch~case~문 활용
		 */
		
		if(point>=90) {
			result ="A";
			if(point%10>=7 ||point==100)
			{
				result+="+";
			}
			else if(point%10>=3)
			{
				result+="0";
			}
			else
			{
				result+="-";
			}
		}else if(point>=80)
		{
			result="B";
			if(point%10>=7)
			{
				result+="+";
			}
			else if(point%10>=3)
			{
				result+="0";
			}
			else
			{
				result+="-";
			}
		}else if(point>=70)
		{
			result="C";
			if(point%10>=7)
			{
				result+="+";
			}
			else if(point%10>=3)
			{
				result+="0";
			}
			else
			{
				result+="-";
			}
		}else if(point>=60)
		{
			result="D";
			if(point%10>=7)
			{
				result+="+";
			}
			else if(point%10>=3)
			{
				result+="0";
			}
			else
			{
				result+="-";
			}
		}
		else {
			result="F";
		}
		
		switch(result) {
			case "A+" : price = "학업우수상";
						break;
			case "A0" : price = "노력상";
			break;
			case "A-" : price = "아차상";
			break;
			default: price = "";
		}
			
			
		System.out.printf("\n당신의 점수는 %d점 입니다.", point);
		System.out.printf("\n당신의 학점은 %s 입니다.", result);
		System.out.printf("\n당신의 받은 상은 %s 입니다.", price);

	}

}
