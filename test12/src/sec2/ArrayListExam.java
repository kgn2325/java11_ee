package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		List<Member> memList2 = new ArrayList<Member>();
		
		for(int i =1; i<=10; i++)
		{
			Member mem = new Member(i,"kim"+i,"abcd"+i+i,"김"+i,0);
			memList.add(mem);
		}
		
		Member mem2 = new Member(11, "kang", "abcd1004","이성하",0);
		memList.add(mem2);
		
		for(Member m : memList) // List 순회
		{
			System.out.println(m.toString());
		}
		System.out.println();
		memList.remove(3); //인덱스가 3인 Member 인스턴스가 제거
		Member tmp1 = new Member(11, "kang", "abcd1004","이성하",0);
		
		System.out.println("데이터 존재 유무 : "+memList.contains(tmp1));// 데이터 존재 유무
		
		for(int i = 0; i<memList.size(); i++)
		{
			Member m = memList.get(i);// get(i) -> memList의 i번째 목록을 가져와라 
			System.out.println(m.toString());
		}
		if(memList2.isEmpty())
		{
			System.out.println("비어 있는 리스트입니다.");
		}else
		{
			System.out.println("내용이 있는 리스트입니다.");
		}
		
		List<String> names = new ArrayList<String>();
		names.add("이민규");
		names.add("이성하");
		names.add("이연정");
		names.add("이종우");
		names.add("이예린");
		names.add("이원석");
		names.add("이희훈");
		
		if(names.contains("이연정"))
		{
			System.out.println("이연정 데이터가 존재합니다.");
		}else
		{
			System.out.println("이연정 데이터가 존재하지 않습니다.");
			names.add("이연정");
		}
		for(String s : names)
		{
			System.out.println(s);
		}
		names.clear();
		
		if(names.isEmpty())
		{
			System.out.println("리스트가 비어 있습니다.");
		}else
		{
			for(String s : names)
			{
				System.out.println(s);
			}
		}
		
		// add, remove, cantains, isEmpty, size, get
	}

}
