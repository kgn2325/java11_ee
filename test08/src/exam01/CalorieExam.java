package exam01;

import java.util.Scanner;

public class CalorieExam {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int calorie, protein, carbohydrate, fat;
		
		System.out.print("단백질 입력 : ");
		protein = scn.nextInt();
		System.out.print("탄수화물 입력 : ");
		carbohydrate = scn.nextInt();
		System.out.print("지방 입력 : ");
		fat = scn.nextInt();
		
		calorie = (protein*4)+(carbohydrate*4)+(fat*9);
		
		System.out.println("칼로리 : " + calorie);
		

	}

}
