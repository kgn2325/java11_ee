package exam;

public class Exam4 {

	public static void main(String[] args) {
		Person[] pArr = new Person[3];//선언만 된 것
		pArr[0] = new Person("김기태");
		pArr[1] = new Person("김동연");
		pArr[2] = new Person("이정후"); //비어 있거나 초기화 되어 있지 않는 pArr 배열에 Person 객체를 생성하여 각 요소에 대입
	
		for(int i=0; i<pArr.length; i++) //실제 선언한 배열의 갯수보다 더 많은 수의 반복실행이 된다.(요청한 횟수가 배열수보다 더 많다.) => ArrayIndexOutOfBoundsException 발생 
		{
			System.out.println(pArr[i].getName());//Person의 배열요소인 pArr 객체가 초기화(값이 대입)되어 있지 않아 NullPointerException 발생
		}

	}

}
