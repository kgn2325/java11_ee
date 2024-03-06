package sec1;

public class BirthdayExam1 {

	public static void main(String[] args) {
		Birthday b = new Birthday();
		b.setName("김동연");
		b.setYear(1992);
		b.setMonth(4);
		b.setDay(2);
		b.birth();
		b.birthAddr();
		
		System.out.println(b.getName()+"의 생일은 "+b.getYear()+"년 "+b.getMonth()+"월 "+b.getDay()+"일 입니다.");
		
		
		Birthday b2 = new Birthday();
		b2.setName("아무개");
		b2.setYear(1999);
		b2.setMonth(3);
		b2.setDay(23);
		b2.birth();
		b2.birthAddr();

	}

}
