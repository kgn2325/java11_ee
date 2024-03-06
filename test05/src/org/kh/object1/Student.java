package org.kh.object1;
//System.out.println(name+"이 달립니다.");//기본형이라 오류 걸림

//학생(Student) 클래스를 작성하되, 해당 학생의 이름(name), 점수(kor, eng, mat)과 tot와 avg를 구하여 출력하는
//resulting()메서드가 있도록하시오.
public class Student {
	String name;//String name ="김동연"; 원래 기본으로 null 숫자는 0 실수는 0.0이 초기화 되는데 다른값으로 초기화할수있다. 옆과같이 직접 지정하면 된다.
	int kor,eng,mat;
	int tot() {
		return this.kor+this.eng+this.mat;
	}
	double avg() {
		return (this.kor+this.eng+this.mat)/3.0;
	};
	
	void resulting()
	{
 

		System.out.println(this.name+"의 국어점수 : "+ this.kor);
		System.out.println(this.name+"의 영어점수 : "+ this.eng);
		System.out.println(this.name+"의 수학점수 : "+ this.mat);
		System.out.println(this.name+"의 총   점 : "+ this.tot());
		System.out.println(this.name+"의 평   균 : "+ this.avg());
	}
}
