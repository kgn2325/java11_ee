package sec2;

public class OverloadEx3 {

	public static void main(String[] args) {
		Board b1 = new Board();//매개변수 없는 방식으로 b1객채 생성
		b1.setBno(1);
		b1.setTitle("즐거운 자바 코딩");
		b1.setUname("abc");
		Board b2 = new Board(101);//bno가 있는 생성자 방식으로 b2객체 생성
		b2.setTitle("다음 주는 평가대비 해야징");
		b2.setUname("wolf");
		b2.getBno();
		Board b3 = new Board(102,"오늘은 코딩 불금");
		b3.setUname("walkman");
		Board b4 = new Board(102,"오늘은 코딩 불금", "김동연");

	}

}
