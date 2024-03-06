package sec2;

public class Birds extends Animal {
	int wings;
	private boolean fly;

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	@Override
	public String print() {
		return "Birds wings=["+wings+"], name="+super.name+"]";
	}
	
	
}
