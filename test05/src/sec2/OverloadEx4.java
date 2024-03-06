package sec2;

public class OverloadEx4 {

	public static void main(String[] args) {
		Notice n = new Notice(43, "자바프로그래밍", "abc", "즐거운 자바 코딩", "박은종", 25000);
		System.out.println(n.toString());
		System.out.println();
		News n1 = new News();
		System.out.println(n1.toString());
	}

}
