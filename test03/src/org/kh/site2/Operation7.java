package org.kh.site2;
// 대입 연산자 : 연산 후에 대입하는 연산자 : +=, -=, *=, /=, %=, &=, |=, >>=, <<=, ^=
// 비트 연산자 : &(and), |(or), ~(complement), ^(xor), >>(right shift), <<(left shift), >>>, 
public class Operation7 {

	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int tmp;
		a += b; // a=35, b=15
		b -= a; // a=35, b=-20
		System.out.println("a = "+a+", b = "+b);
		// a와 b의 값을 맞교환
		tmp=a;//임시기억장소(tmp)
		a=b;
		b=tmp;
		System.out.println("a = "+a+", b = "+b);
		//비트(2진수) 연산
		int x = 0b01101;
		int y = 0b01011;
		int z = a|b;
		System.out.println("\nx = "+Integer.toBinaryString(x)+" y = "+Integer.toBinaryString(y)+" z = "+z);
		System.out.println("x & y = "+Integer.toBinaryString(x & y)+" x | y = "+Integer.toBinaryString(x | y)); // and, or
		System.out.println("x ^ y = "+Integer.toBinaryString(x ^ y)); // xor : 입력이 다를경우 1 같을경우 0 출력 
		System.out.println("~x = "+Integer.toBinaryString(~x));
		System.out.println("~x = "+~x);
		System.out.println("x >> 2 = "+Integer.toBinaryString(x >> 2)); //>>는 오른쪽으로 한개씩민다 20 >> 1 = > 10, 20 >> 2 => 5, >> 1씩 올라갈때마다 2로 나눈 수와 동일 
		System.out.println("x << 2 = "+Integer.toBinaryString(x << 2)); // <<는 왼쪽으로 한개씩밀어서 *2와 동일 20<<1 : 40, 20<<2 : 80
		System.out.println(Integer.toBinaryString(20));
		System.out.println(20<<1);
		System.out.println(20<<2);
		System.out.println(20<<3);
		System.out.println(20<<4);
		System.out.println(20>>1);
		System.out.println(20>>2);
		System.out.println(20>>3);
		System.out.println(20>>4);
		
		
		System.out.println("****************대입연산자**************");
		
		int i = 25; // 1 1 0 0 1
		int j = 30; // 1 1 1 1 0
		i &=j; // i = i & j

		System.out.println("i &= j : "+i); // 1 1 0 0 0 => 24
		i = 25;
		i |=j;
		System.out.println("i |= j : "+i); // 1 1 1 1 1 => 31
		i = 25;
		i ^=j;
		System.out.println("i ^= j : "+i); // 0 0 1 1 1 => 7
		j>>=2;
		System.out.println("j >>= 2 : "+ j); // 1 1 1 =>7
		j=30;
		j <<=2;
		System.out.println("j <<= 2 : "+ j); // 1 1 1 1 0 0 0 => 120
		j=30;
		j >>>=2;// <<<= 는 없다
		System.out.println("j >>>= 2 : "+ j);

	}

}
