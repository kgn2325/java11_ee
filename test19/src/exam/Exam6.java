package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Food> fList = new ArrayList<>();
		while(true)
		{
			System.out.println("=== 음식 메뉴 리스트 ===");
			System.out.println("1. 음식 추가");
			System.out.println("2. 음식 정보");
			System.out.println("3. 음식 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.println("번호 선택 : ");
			int a = scn.nextInt();
			if(a==1)
			{
				System.out.println("추가할 음식 입력 : ");
				String s = scn.next();
				System.out.println("칼로리 입력 : ");
				int c = scn.nextInt();
				//System.out.println();
				Food f = new Food(s,c);
				fList.add(f);	
			}else if(a==2)
			{
				for(Food f: fList)
				{
					System.out.println(f.toString());
				}
			}else if(a==3)
			{
				System.out.println("삭제하고 싶은 음식 선택 : ");
				String s = scn.next();
				Food f2 = new Food();
				for(int i =0; i<fList.size(); i++)
				{
					if(s.equals(fList.get(i).getName()))
					{
						f2 = fList.get(i);
						System.out.println(f2.toString()+ "가 삭제되었습니다.");
						fList.remove(i);
					}
				}
			}else if(a==4)
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}else
			{
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
		}

	}

}
