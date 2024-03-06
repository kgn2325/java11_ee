package sec2;
//함수(메소드) 정의와 사용 방법
class Met1{
	void method1()//매개변수X, 반환X
	{
		int x= 100, y = 200;
		System.out.println(x+y);
	}
}
class Met2{//매개변수 O, 반환X
	void method2(int x, int y)
	{
		System.out.println(x+y);
	}
}

class Met3{//매개변수 X, 반환 O
	int method3()
	{
		int x= 100, y = 200;
		return x+y;
	}
	
}

class Met4{//매개변수 O, 반환 O
	int method4(int x, int y)
	{
		return x+y;
	}
	
}

public class FunctionExam {

	public static void main(String[] args) {
		
		//메서드(Method) : 특정 클래스에 멤버로 규정되어 있어서 객체 생성을 하고, 해당 객체.메소드명(값,...)으로 호출 
		System.out.println("메소드(Method)");
		Met1 met1 = new Met1();
		met1.method1();
		
		Met2 met2 = new Met2();
		met2.method2(100, 200);
		
		Met3 met3 = new Met3();
		System.out.println(met3.method3());
		
		Met4 met4 = new Met4();
		System.out.println(met4.method4(100,200));
		
		System.out.println();
		System.out.println("함수(Function)");
		fnc1();
		fnc2(100,200);
		System.out.println(fnc3());
		System.out.println(fnc4(100,200));

	}

	public static void fnc1()//매개변수X, 반환X
	{
		int x = 100;
		int y =200;
		System.out.println(x+y);
	}
	
	public static void fnc2(int x, int y)//매개변수O, 반환X
	{
		System.out.println(x+y);
	}
	
	public static int fnc3()//매개변수X, 반환O
	{
		int x = 100;
		int y =200;
		return x+y;
	}
	
	public static int fnc4(int x, int y)//매개변수O, 반환O
	{
		return x+y;
	}
}
