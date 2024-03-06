package sec3;

public class PeopleExam {

	public static void main(String[] args) {
		People p1 = new People();
		People.selNum = 200; // People.selNum =200 와 동일 => 클래스 변수 == 정적 필드 == 공유데이터;
		p1.name = "김기태"; // 인스턴스 변수 == 동적 필드
		p1.age = 43;
		p1.addr = "가산동";
		
		
		
		People p2 = new People();
		People.selNum = 300; // People.selNum =300;
		p2.name = "박동빈";
		p2.age = 46;
		p2.addr = "안암동";
		
		People.selNum = 400;
		
		System.out.println(People.selNum+", "+p1.name+", "+p1.age+", "+p1.addr);
		System.out.println(People.selNum+", "+p2.name+", "+p2.age+", "+p2.addr);
		
		p1.print1();
		p2.print1();
		
		p1.print2();
		p2.print2();
		
		//정적(static) 요소 : static으로 선언된 필드 또는 메소드
		//정적(static) 메소드 : 객체의 생성없이 해당하는 클래스에서 바로 활용하는 메소드
		System.out.println("정적 메소드 == 클래스 메소드");
		People.print2();
		People.selNum = 500;
		p1.print1();
		p2.print1();

	}

}
