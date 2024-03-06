package sec3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Set : 값만 저장, 중복을 허용하지 않음, 순서유지 하지 않음
//Set 종료 : HashSet, TreeSet
public class SetExam {

	public static void main(String[] args) {
		//Set의 선언 및 생성
		Set<String> set1 = new HashSet<>();
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set1.add("김기태");
		set1.add("이정희");
		set1.add("이예린");
		set1.add("이종우");
		set1.add("이연정");
		set1.add("김기태");
		set1.add("이성하");
		set1.add("이민규");
		set1.add("이원석");
		
		System.out.println("요소의 수 : "+set1.size());
		System.out.println(set1);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		if(set1.contains(name))
		{
			System.out.println("\n해당 이름이 존재합니다");
		}else
		{
			set1.add(name);
			System.out.println("\n"+name+"이 입력되었습니다.");
		}
		
		if(set2.isEmpty())
		{
			System.out.println("set2 가 비어 있습니다.");
		}
		else {
			System.out.println("set2의 요소의 수 : "+set2.size());
		}
		
		//set1에 특정 요소 삭제
		set1.remove("김기태");
		//set1 비우기
		set1.clear();
		while(set2.size()!=6)
		{
			set2.add((int) (Math.random()*45+1));
		}
		
		System.out.println(set2);
		
		Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(9,3,4,6,8,7,6));
		System.out.println(set3);
		
		//Set의 순회
		for(Integer s : set3) {
			System.out.println(s);
		}
		System.out.println();
		//Set 순회2->Iterator에 의한 순회
		Iterator it = set3.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}
	}

}
