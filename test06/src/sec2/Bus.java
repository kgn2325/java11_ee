package sec2;

public class Bus {
	private int no; // 노선번호
	private int cnt;// 승객수
	private int money; //요금 
	
	//객체 생성시 노선번호(no)만 입력받는 생성자 함수
	public Bus(int no)
	{
		this.no = no;
	}
	
	//승객이 버스를 타면 행해지는 일
	public void take(int money) {
		this.money +=money;
		cnt++;
	}
	
	// 버스의 현제 정보 출력
	public void show()
	{
		System.out.println("버스번호 : "+this.no+", 수입금액 : "+this.money+", 승객수 : "+this.cnt);
	}
}
