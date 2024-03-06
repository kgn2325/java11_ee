package sec2;

public class Bank {
	private int account;
	private int money;
	private String bankName;
	private String name;
	
	public Bank() {}
	
	
	public Bank(int account, int money, String bankName, String name) {
		this.account = account;
		this.money = money;
		this.bankName = bankName;
		this.name = name;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Bank [account=" + account + ", money=" + money + ", bankName=" + bankName + ", name=" + name + "]";
	}
	
	
	
	
}
