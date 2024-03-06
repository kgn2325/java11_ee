package sec3;
//reduce() 활용하기
//예시 : 여러 문자열(String)의 배열에서 가장 글자 수가 많은(이진수 값이 가장 큰) 문자열을 찾아 반환하는 프로그램을 작성
//BinaryOperator : 문자든 숫자든 모두 2진수로 변환하여 비교하거나 처리하고자 할 때 활용되는 인터페이스

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length>=s2.getBytes().length)
		{
			return s1;
		}
		else return s2;
	}
	
}

public class StreamExam3 {

	public static void main(String[] args) {
		String[] arr = {"자바","프레임워크","데이터베이스","머신러닝","Java Programing","yoyoyo"};
		
		System.out.println(Arrays.stream(arr).reduce("", (s1,s2) ->{
			if(s1.getBytes().length>=s2.getBytes().length)
			{
				return s1;
			}
			else return s2;
		}));
		
		System.out.println("BinaryOperator를 활용한 reduce");
		String res = Arrays.stream(arr).reduce(new CompareString()).get();
		System.out.println(res);

	}

}
