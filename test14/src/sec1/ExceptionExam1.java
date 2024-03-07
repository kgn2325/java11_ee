package sec1;
//예외(Exception) 처리 : 프로그래밍 로직상 에러가 발생하면, 그 이후의 처리문장은 처리되지 못하고 실행이 중지되는데
// 이러한 경우를 예외라고 하며 그렇다면 다음 문장까지 실행될 수 있도록  계속 다음 문장도 처리될 수 있도록 하는것을 예외 처리라고 합니다. 
//Failure(고장) : 시스템적인 이상으로 정상적으로 하드웨어나 소프트웨어가 동작하지 못하는 현상
//Error(오류) : 프로그램 작업시에 코드의 문법적 구문 오류, 개발자의 논리적 문장의 실수 등으로 인해 정상적인
//Exception(예외): 고장이나 오류와 다르게 개발자의 잘못된 코딩으로 인해 정장석으로
public class ExceptionExam1 {

	public static void main(String[] args) {
		String name = null;
		//실제 처리할 문장(try)이 예외가 발생하면, 예외처리 문장을 실행한다.
		try {
			//실제 처리할 문장
			System.out.println(name.toString());
		}catch(Exception e)
		{
			//예외가 발생할 경우 처리할 문장
			System.out.println("알 수 없는 예외가 발생하였습니다.");
		}

	}

}
