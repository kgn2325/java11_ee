package sec1;

import java.util.Scanner;

public class StudentExam {

	public static void main(String[] args) {
		/*Student s1 = new Student(1, 80, 75, 100);
		Student s2 = new Student(2, 60, 85, 90);
		Student s3 = new Student(3, 50, 70, 80);
		Student s4 = new Student(4, 20, 30, 50);
		Student s5 = new Student(5, 100, 90, 95);
		
		s1.print();
		s2.print();
		s3.print();
		s4.print();
		s5.print();
		//5명의 학생(Student) 배열 객체 선언
		Student[] s = new Student[5]; //s[0].kor, s[0].eng ~ s[4]kor, s[4].eng...
		Scanner scn = new Scanner(System.in);
		for(int i=0; i<s.length; i++)
		{
			s[i] = new Student(); // 개별 객체 생성
			s[i].setNo(i+1);
			System.out.print((i+1)+"번째 국어 : ");
			s[i].setKor(scn.nextInt());
			System.out.print((i+1)+"번째 영어 : ");
			s[i].setEng(scn.nextInt());
			System.out.print((i+1)+"번째 수학 : ");
			s[i].setMat(scn.nextInt());
			
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		
		for(int i=0; i<s.length; i++)
		{
			s[i].print();
		}*/
		
		
		Student[] s = new Student[5];
		Scanner scn = new Scanner(System.in);
		for(int i=0; i<s.length; i++)
		{
			s[i] = new Student();
			s[i].setNo(i+1);
			System.out.print((i+1)+"번째 국어 : ");
			s[i].setKor(scn.nextInt());
			System.out.print((i+1)+"번째 영어 : ");
			s[i].setEng(scn.nextInt());
			System.out.print((i+1)+"번째 수학 : ");
			s[i].setMat(scn.nextInt());			
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		
		for(int i = 0; i<s.length; i++)
		{
			s[i].print();
		}

	}

}
