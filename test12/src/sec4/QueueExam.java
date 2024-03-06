package sec4;

import java.util.LinkedList;
import java.util.Queue;
//Queue : First In First Out -> 선입선출 : 먼저 입력한 데이터가 먼저 출력
//자바에서는 Queue가 인터페이스 이므로 같은 구조를 가진 LinkedList를 이용하여 생성한다.
public class QueueExam {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		//큐(Queue)에 요소 추가
		q.offer("아이브");
		q.offer("에스파");
		q.offer("빅뱅");
		q.offer("핑클");
		q.offer("블랙핑크");
		q.offer("뉴진스");
		q.offer("BTS");
		q.offer("르세라핌");
		
		System.out.println(q);
		System.out.println(q.peek()); // 맨 처음 데이터 검색 반환
		System.out.println(q.peek());
		System.out.println(q.poll());// 맨 처음 데이터 반환 후 제거
		System.out.println(q.poll());
		
		System.out.println(q);

	}

}
