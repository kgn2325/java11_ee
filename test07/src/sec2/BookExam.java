package sec2;

public class BookExam {

	public static void main(String[] args) {
		//100 개의 Book 배열 선언
		Book[] book = new Book[100];
		/*for(int i = 0; i<10; i++)
		{
			book[i] = new Book("책 제목"+i,"저자"+i);
		}*/
		
		book[0] = new Book("자바 프로그래밍 입문","박은종");
		book[1] = new Book("HTML/CSS","전은철");
		book[2] = new Book("자바스크립트/제이쿼리 입문","정인용");
		book[3] = new Book("코틀린 프로그래밍","황영덕");
		book[4] = new Book("안드로이드 앱 프로그래밍","정재곤");
		
		for(int i = 0; i<5; i++)
		{
			System.out.println(book[i].toString());	
		}

	}

}
