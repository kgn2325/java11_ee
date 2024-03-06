package org.kh.app;
// 조건문 if-else ~ : if(조건식){조건이 참일때 실행문;} else{조건이 거짓일때 실행문;}
public class Condition2 {

	public static void main(String[] args) {
		char sel = '1';
		//성별코드(sel)가 1이거나 3이면, 성별이 "남성", 아니면, "여성"
		String gander;
		if(sel=='1'||sel=='3') {
			gander="남성";
		}
		else
		{
			gander="여성";
		}
		System.out.println("당신의 성별은 : " + gander);

	}

}
