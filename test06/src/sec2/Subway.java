package sec2;

public class Subway {
	private int no; // 지하철 노선번호(호선)
	private String station; //지하철역
	private int cnt; // 요금
	private int money; // 승객수
	
	//지하철 노선번호 매개변수로 받는 생성사 함수
	public Subway(int no)
	{
		this.no = no;
	}
	
	//지하철 승객이 탑승하면 생기는 필드의 값 변환
	public void take(int money) {
		this.money += money;
		cnt++;
	}
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	//현재 지하철 정보 출력
	public void show()
	{
		System.out.println("지하철 "+this.no+"호선, 누적요금 : "+this.money+", 누적승객 : "+this.cnt);
	}
}
