package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> nameList = new ArrayList<String>();
		
		
		while(true)
		{
			System.out.print("추가할 이름을 입력하세요 : ");
			String name = sc.next();
			
			if(name.equals("clear"))//String 비교는 ==이 아니라, equals()를 써야하므로 ==를 쓰면 정상 비교가 되지 않는다.
			{
				System.out.println("이름 목록을 초기화 합니다.");
				nameList.clear();
				continue;//continue 구문이 실행해야할 다른 문장보다 앞서 있어서 continue 구문 이후의 문장이 실행되지 못함.
			}
			
			if(name.equals("exit")) {
				System.out.println("<<입력 종료>>");
				break; //return은 exit가 입력될경우 아래 반복출력 문장을 실행하지 못하고 main함수(메소드)의 밖으로 탈출해 버린다.
			}
			
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름입니다>");
			}else {
				nameList.add(name);//이름 목록(nameList)에 이름을 추가하는 구현 코드의 누락으로 인해 추가하지 못함.
				System.out.println(name+" 추가 완료.");
			}
		}
		
		for(String name : nameList)
		{
			System.out.println(name);
		}
	}

}
