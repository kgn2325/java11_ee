package sec3;
//Scope : 특정 변수가 영향을 미치는 범위
public class ScopeExam {
	int a = 10;//전역변수 : 클래스 전체에서 인지되는 변수이지만, 특정 메소드(함수)내에서는 인지 하지 못함.
	static int b = 100; //클래스 변수 : 클래스 전체에서 인지되며, 특정 메소드(함수)내에서도 인지함.
	public static void main(String[] args) {
		
		int a =20;//지역변수 : 특정 메소드(함수)내에서 선언되며 활용되는 변수 로서 함수 블록을 벗어나면, 인지할 수 없음. 함수내부에서만 사용 가능 {}하면 날라감(소멸) -> Local scope
		System.out.println("지역변수 a = "+a);
		run();
		run(30);

	}
	public static void run()
	{
		//System.out.println("전역 변수 a = "+a); 메소드에서는 전역변수 인식 불가 사용할려면 static를 써라
		System.out.println("클래스 변수 b = "+b);
	}

	
	public static void run(int a) //매개변수 : 메소드(함수) 정의시 괄호 안에 있는 변수로 호출시 지정된 값을 저장한다. -> Local scope
	{
		System.out.println("매개변수 a = "+a);
	}

}
