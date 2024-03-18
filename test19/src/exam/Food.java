package exam;

public class Food {
	private String name;
	private int cal;
	
	public Food() {}

	public Food(String name, int cal) {
		super();
		this.name = name;
		this.cal = cal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCal() {
		return cal;
	}

	public void setCal(int cal) {
		this.cal = cal;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", cal=" + cal + "]";
	}
	

}
