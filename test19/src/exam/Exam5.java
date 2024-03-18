package exam;

import java.util.ArrayList;
import java.util.List;

public class Exam5 {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		//list.add("바나나"); // list(ArrayList)의 제네릭 타입은 Fruit로 설정되어 있으므로 Fruit으로 객체를 생성하여 요소를 추가해아 하지만, 코드에서는 String을 요소로 추가하였다. => Type MissMatch Error
		
		for(int i = 0; i<list.size(); i++)//list(ArrayList) 컬랙션 프레임워크는 length 속성이 없어 요소의 수를 구할 수 없음 => size() 메소드를 사용해야 한다 => Not Found  Attribute(속성) Error 발생
		{
			System.out.println(list.get(i).getName());//[인덱스]는 배열 객체에서 활용해야 하지만, list(ArrayList) 인 곳에 배열 요소 참조 연산인 [] 이 사용되었음 => Not Allowed Operation Error 발생
		}

	}

}
