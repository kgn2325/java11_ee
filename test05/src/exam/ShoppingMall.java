package exam;

public class ShoppingMall {
	private String bno;
	private String id;
	private String date;
	private String name;
	private String pno;
	private String address;
	
	public ShoppingMall() {}
	
	public ShoppingMall(String bno, String id, String date, String name, String pno, String address) {
		this.bno = bno;
		this.id = id;
		this.date = date;
		this.name = name;
		this.pno = pno;
		this.address = address;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void print() {
		System.out.println("주문 번호 : "+bno);
		System.out.println("주문자 아이디 : "+id);
		System.out.println("주문 날짜 : " +date);
		System.out.println("주문자 이름 : " +name);
		System.out.println("주문 상품 번호 : " + pno);
		System.out.println("배송 주소 : "+ address);
	}
	
}
