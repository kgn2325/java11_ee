package org.kh.app2;
//반복문 : for, while, do~while~
public class Loop1 {

	public static void main(String[] args) {
		/*
		  조건식이 참 일때 동안 반복수행한다.
		  for(초기식; 조건식; 증감식){반복해야할 문장;}
		 */
		int n = 0;
		for(int i=0; i<10; i++)
		{
			n = n+1;
		}
		System.out.println("n = "+n);
		
		int[] nums = {80, 95, 75, 60, 100, 65,70,90,85,95};
		String names[] = {"김", "이", "박", "최","정", "오", "배", "강","장","계"};
		System.out.println("nums : " +nums); //nums의 주소 출력
		System.out.println("names : " + names);// names의 주소 출력
		int tot = 0;
		int maxpoint=nums[0];
		int minpoint=nums[0];
		double avg;
		System.out.print("이름\t점수\t학점\t판정\n");
		for(int i = 0; i<10; i++) {
			tot +=nums[i];
			System.out.print(names[i]+"\t");
			System.out.print(nums[i]+"\t");
			if(nums[i]>=90)
			{
				System.out.print("A\t");
			}else if(nums[i]>=80)
			{
				System.out.print("B\t");
			}
			else if(nums[i]>=70)
			{
				System.out.print("C\t");
				
			}
			else if(nums[i]>=60)
			{
				System.out.print("D\t");
			}
			else
			{
				System.out.print("F\t");
			}
			
			if(nums[i]>=70)
			{
				System.out.print("합격");
			} else
			{
				System.out.print("탈락");
			}
			System.out.println();
			
			
			if(maxpoint<nums[i])
			{
				maxpoint=nums[i];
			}
			if(minpoint>nums[i]) 
			{
				minpoint=nums[i];
			}
			
		}
		System.out.println("학생의 점수 합계는 "+tot+"입니다.");
		avg = (double)tot/10;
		System.out.println("학생들의 점수 평균은 "+ avg+"입니다.");
		System.out.println("최대 점수 : " + maxpoint);
		System.out.println("최소 점수 : " + minpoint);
	}

}
