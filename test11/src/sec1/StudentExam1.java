package sec1;

public class StudentExam1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student su1 = new Student();
		Student su2 = new Student();
		
		su2 = su1; // 얕은 복사
		Student su3 = (Student) su1.clone();
		System.out.println(su1.getClass().toString());//해당 인스턴스의 클래스 이름 출력
		System.out.println(su1 instanceof Student); // instanceof => 연산자 su1인스턴스가 Student 클래스로 생성된 것인지의 유무 판단.
		System.out.println(su1.toString()); //현재 su1의 인스턴스에 대한 stack에 있는 heep의 위치를 16진수로 출력
		System.out.println(su1.equals(su2));// 두 객체(인스턴스)가 같은지 비교
		System.out.println(su1.hashCode());//해시코드 16진수를 -> 10진수로 변경
		//Student 클래스에 equals를 모든 멤버 필드(변수)에 대하여 비교하는 오버라이딩을 해주면, 값 비교가 가능
		
		System.out.println(su3.equals(su1));//su3와 su1의 주소가 서로 다르므로 false 오버라이드 해서 값비교로 변경하면 true출력
		System.out.println(su3.equals(su1));//값 비교하려면 equals를 오버라이드를 해야한다.
		
		
		
	}

}
