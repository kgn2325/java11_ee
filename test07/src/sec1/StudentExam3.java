package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam3 {

	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student>();
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i<5; i++)
		{
			Student st = new Student();
			st.setNo(i+1);
			System.out.print((i+1)+"번째 국어 : ");
			st.setKor(scn.nextInt());
			System.out.print((i+1)+"번째 영어 : ");
			st.setEng(scn.nextInt());
			System.out.print((i+1)+"번째 수학 : ");
			st.setMat(scn.nextInt());
			
			s.add(st);
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		for(Student t:s)
		{
			t.print();
		}
		

	}

}
