package org.hk.site;
//명령(연산) => Operation(Opcode+Operand) : 0주소 방식 ~ 3주소 방식
//입력 항에 따라 : 단항(Unary), 이항(Binary), 삼항(ThreeFlow)
public class Operation1 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = !b1; // 단항
		int i1 = 20, i2= 40;
		int i3 = i1+i2; // 이항
		int max = (i1>i2)? i1:i2;// 조건식이 맞으면 i1 틀리면 i2 삼항 연산 
		System.out.println("b1 : "+b1);
		System.out.println("b2 : "+b2);
		System.out.println("i1 : "+i1);
		System.out.println("i2 : "+i2);
		System.out.println("i3 : "+i3);
		System.out.println("max : "+max);
		

	}

}
