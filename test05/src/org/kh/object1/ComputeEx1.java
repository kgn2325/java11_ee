package org.kh.object1;
//메서드(Method) : 정의 -> 호출
public class ComputeEx1 {

	public static void main(String[] args) {
		
		Compute01 comp1 = new Compute01();
		comp1.fnc1();//메소드 호출
		comp1.fnc2(100);
		int a= comp1.fnc3();
		System.out.println(comp1.fnc3());
		System.out.println(a);
		String pass = comp1.fnc4(85);
		System.out.println(pass);
		int b= comp1.fnc5(30, 23);
		System.out.println(b);
		String c = comp1.fnc6();
		System.out.println(c);
		comp1.fnc7(); 
		comp1.fnc8(50,3);
		
		fnc1();
		fnc2(200);
		System.out.println(fnc3());
		System.out.println(fnc4(25));
		
		

	}
	//함수(Function) : 정의 호출
	public static void fnc1(){
		System.out.println("반환(x), 매개 변수(x)");
	}
	public static void fnc2(int a){
		System.out.println("입력 수 : "+a);//반환(x), 매개 변수(o)
	}
	public static int fnc3(){
		return 500;//반환(o), 매개 변수(x)
	}
	public static double fnc4(int radius){
		return radius*radius*3.1415;//반환(o), 매개 변수(o)
	}

}
