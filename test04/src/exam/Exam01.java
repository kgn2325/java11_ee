package exam;

public class Exam01 {

	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		int result=0;
		char operator = '+';
		if(operator =='+')
		{
			result = num1+num2;

		}else if(operator =='-')
		{
			result = num1-num2;

		}
		else if(operator =='*')
		{
			result = num1*num2;
		
		}
		else if(operator =='/')
		{
			result = num1/num2;
		}
		else
		{
			System.out.println("사칙 연산이 아닙니다.");
		}
		
		switch(operator)
		{
			case '+' : result = num1+num2; 
			case '-' : result = num1-num2;
			case '*' : result = num1*num2;
			case '/' : result = num1/num2;
			default : System.out.println("사칙연산이 아닙니다.");
		}
		
		System.out.println(result);

	}

}
